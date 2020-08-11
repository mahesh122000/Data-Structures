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
	         int k=s.nextInt();
	         String c=s.next();
	         int ans=0;
	         int l=-1;
	         for(int i=0;i<c.length();)
	         {
	             char d=c.charAt(i);
	             if(d=='(')
	             l++;
	             else if(d==')')
	             l--;
	             else
	             {
	                 if(l==k)
	                 {int val=0;
	                 one:for(int j=i;j<c.length();j++)
	                 {
	                     if(c.charAt(j)==')'||c.charAt(j)=='(')
	                     {
	                         i=j-1;
	                         break one;
	                     }
	                     val=val*10+c.charAt(j)-'0';
	                 }
	                 ans+=val;
	                 }
	             }
	             i++;
	         }
	         System.out.println(ans);
	     }
	 }
}