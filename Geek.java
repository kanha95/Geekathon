
package geek;
import java.util.*;

public class Geek {

    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  
  int t=sc.nextInt();
  sc.nextLine();
  while(t>0){
      int count=0;
      String s=sc.nextLine();
      int temp=s.charAt(0);
      for(int i=1;i<s.length();i++){
          if(s.charAt(i)==temp){
              count++;
              temp=s.charAt(i);
          }else{
              temp=s.charAt(i);
          }
      }
      System.out.println(count);
      t--;
  }
    }
    
}
