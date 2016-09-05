
package geek2;

import java.util.*;

public class Geek2 {
    int total=0;
void sum(int[] arrc,int[] arr){
    
    for(int j=0;j<arrc.length;j=j+2){
    for(int i=arr.length-1;i>=0;i--){
       
           if(Math.pow(arrc[j],2)+Math.pow(arrc[j+1],2)<=Math.pow(arr[i], 2)){
               if(i==arr.length-1){
                   total=total+ arr.length;
                  
                break;           
                  
               }else{
               total=total+(i+1);
               
              break;
           }
           }
               
           
       }        
    }
}
        
    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      Geek2 obj=new Geek2();
      while(t>0){
      int R,N;
      R=sc.nextInt();
      N=sc.nextInt();
      int[] arr=new int[R];
      int[] arrc=new int[2*N];
          for(int i=0;i<R;i++){
              arr[i]=sc.nextInt();
          }
          for(int j=0;j<2*N;j++){
              arrc[j]=sc.nextInt();
          }
          obj.sum(arrc,arr);
          System.out.println(obj.total);
          obj.total=0;
          t--;
      }
    }
    
}
