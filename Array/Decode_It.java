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
	         int k=s.nextInt();
	         StringBuilder a=new StringBuilder("");
	         int val=0;
	         for(int i=0;i<c.length();i++)
	         {
	             if(c.charAt(i)>='0' && c.charAt(i)<='9')
	             {
	                 val=val*10+c.charAt(i)-'0';
	             }
	             else
	             {
	                 if(val!=0)
	                 {
	                     StringBuilder temp=new StringBuilder("");
	                     for(int j=0;j<val;j++)
	                     {
	                         temp=temp.append(a);
	                     }
	                     a=temp;
	                     val=0;
	                 }
	                 a=a.append(c.charAt(i));
	             }
	         }
	         if(val!=0)
	         {
	               StringBuilder temp=new StringBuilder("");
	               for(int j=0;j<val;j++)
	               {
	                   temp=temp.append(a);
	               }
	               a=temp;
	        }
	        String b=a.toString();
	         System.out.println(b.charAt(k-1));
	     }
	 }
}