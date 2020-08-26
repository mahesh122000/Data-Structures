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
	         String str=s.next();
	         int a[]=new int[n];
	         for(int i=0;i<n;i++)
	         a[i]=s.nextInt();
	         char c[]=str.toCharArray();
	         for(int i=0;i<n;i++)
	         {
	             int j=0;
	             while(a[i]-->0)
	             {
	                 if(c[j]=='z')
	                 c[j]='a';
	                 else
	                 c[j]=(char)(c[j]+1);
	                 j++;
	             }
	         }
	         System.out.println(new String(c));
	     }
	 }
}