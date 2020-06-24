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
	 {String c=s.next();
	 Stack<Integer>st=new Stack<>();
	 int count=0;
	 int max=0;
	 for(int i=0;i<c.length();i++)
	 {char cc=c.charAt(i);
	 if(cc=='(')
	 {st.push(count);
	 count=0;}
	 else
	 {if(st.isEmpty())
	 {count=0;}
	 else
	 {
	 count+=2+st.peek();
	 st.pop();
	 max=Math.max(max,count);    
	 }
	 }}
	 System.out.println(max);
	 }}
}