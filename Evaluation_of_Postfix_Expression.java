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
	     Stack<Integer>st=new Stack<>();
	     for(int i=0;i<c.length();i++)
	     {
	       char d=c.charAt(i);
	       if(d>='0' && d<='9')
	       st.push((int)(d-'0'));
	       else
	       {
	           int q=st.pop();
	           int p=st.pop();
	           if(d=='+')
	           {st.push(p+q);}
	           else if(d=='-')
	           {st.push(p-q);}
	           else if(d=='*')
	           {st.push(p*q);}
	           else
	           {st.push(p/q);}
	       }
	     }
	     System.out.println(st.peek());
	 }
	 }
}