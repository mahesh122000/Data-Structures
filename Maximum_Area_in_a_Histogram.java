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
	 Stack<int []>st=new Stack<>();
	 long max=0;
	 long a[]=new long[n+1];
	 for(int i=0;i<n;i++)
	 a[i]=s.nextInt();
	 a[n]=0;
	 int j=0;
	 for(int i=0;i<=n;i++)
	 {
	     for(j=i;!st.isEmpty() && a[i]<=a[st.peek()[0]];)
	     {int x[]=st.pop();
	     j=x[1];
	     max=Math.max(max,a[x[0]]*(i-j));}
	     st.push(new int []{i,j});}
	     System.out.println(max);}
	 }
}