
package geek3;

import java.util.*;


public class Geek3 {
    int mn;
    LinkedList adj[];
Geek3(int n){
    mn=n;
    adj=new LinkedList[n+1];
    for(int i=1;i<=n;i++){
        adj[i]=new LinkedList();
    }
}  
void addedge(int u,int v){
    adj[u].add(v);
}
   boolean reachable(int x,int y){
       LinkedList queue=new LinkedList();
       boolean visited[]=new boolean[mn+1];
     
       queue.add(x);
       visited[x]=true;
       while(queue.size()!=0){
          x = (int) queue.poll();
        
          int n;
          Iterator it=adj[x].iterator();
          while(it.hasNext()){
              n=(int) it.next();
              if(n==y) return true;
              if(!visited[n]){
                  visited[n]=true;
                  queue.add(n);
              }
          }
           
       }
       
       return false;
   }
  
    
    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int t=sc.nextInt();
 
 while(t>0){
   int n=sc.nextInt();
 Geek3 obj=new Geek3(n);
 sc.nextLine();
String s=sc.nextLine();
s=s.replaceAll(" ","");

int q=sc.nextInt();
for(int i=0;i<s.length();i+=2){
    String temp="",temp1="";
    temp+=s.charAt(i);
    temp1+=s.charAt(i+1);
    int u=Integer.parseInt(temp);
    int v=Integer.parseInt(temp1);
    obj.addedge(u, v);
    
}

while(q>0){
    int x=sc.nextInt();
    int y=sc.nextInt();
if(obj.reachable(x,y)){
    System.out.print(x+" ");
}
else if(obj.reachable(y, x)){
    System.out.print(y+" ");
    
}else{
    System.out.print("-1");
}
    
    q--;    
}
  

  
   
     
     t--;
 }
    }
    
}
