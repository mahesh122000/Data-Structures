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
	         String a[]=new String[n];
	         for(int i=0;i<n;i++)
	         a[i]=s.next();
	         String ans=a[0];
	         for(int i=1;i<n;i++)
	         {
	             int j=0;
	             for(;j<Math.min(ans.length(),a[i].length());j++)
	             {
	                 if(ans.charAt(j)!=a[i].charAt(j))
	                 break;
	             }
	             ans=ans.substring(0,j);
	         }
	         if(ans.length()!=0)
	         System.out.println(ans);
	         else
	         System.out.println("-1");
	     }
	 }
}