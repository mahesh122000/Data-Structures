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
	         int n=s.nextInt();
	         int rr=0,rb=0,br=0,bb=0;
	         int k=0;
	         for(int i=0;i<n;i++)
	         {
	             String c=s.next();
	             k=c.length();
	             if(c.charAt(0)=='R')
	             {
	                 if(c.charAt(c.length()-1)=='R')
	                 rr++;
	                 else
	                 rb++;
	             }
	             else
	             {
	                 if(c.charAt(c.length()-1)=='B')
	                 bb++;
	                 else
	                 br++;
	             }
	         }
	         int min=Math.min(rb,br);
	         int ans=0;
	         if(rb==0 && br==0)
	         ans=Math.max(rr,bb);
	         else if(rb==br)
	         ans+=rr+bb+2*rb;
	         else
	         ans+=rr+bb+2*min+1;
	         ans=ans*k;
	         if(ans==k)
	         System.out.println(0);
	         else
	         System.out.println(ans);
	     }
	 }
}