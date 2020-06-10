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
	 {
	     String c=s.next();
	     int n=c.length();
	     int v=1;
	     Stack<Integer>st=new Stack<>();
	     for(int i=0;i<=n;i++)
	     {st.add(v++);
	     if(i==n)
	     {while(!st.isEmpty())
	     {System.out.print(st.peek());
	     st.pop();
	     }}
	     if(i<n && c.charAt(i)=='I')
	     {while(!st.isEmpty())
	     {System.out.print(st.peek());
	     st.pop();
	     }}
	     }
	     System.out.println();
	 }
	 }
}