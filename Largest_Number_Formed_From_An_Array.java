import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {  
     
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {int n=s.nextInt();
	 String ans[]=new String[n];
	 for(int i=0;i<n;i++)
	 ans[i]=s.next();
     Arrays.sort(ans,(x,y)->(x+y).compareTo(y+x)>0?-1:1);
	 System.out.println(String.join("",ans));}}
}