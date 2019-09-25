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
	 int a[]=new int[n];
	 for(int i=0;i<n;i++)
	 a[i]=s.nextInt();
	 Stack<Integer>st=new Stack<Integer>();
	 System.out.print("1 ");
	 int i=0;
	 st.push(i);
	 for( i=1;i<n;i++)
	 {while(!st.empty() && a[st.peek()]<=a[i])
	 st.pop();
	 if(st.empty())
	 System.out.print(i+1+" ");
	 else
	 {int p=i-st.peek();
	 System.out.print(p+" ");}
	 st.push(i);}
	 System.out.println();
	 }
}}