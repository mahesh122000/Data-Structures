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
	         int a[]=new int[n];
	         int sum=0;
	         for(int i=0;i<n;i++)
	         {
	             a[i]=s.nextInt();
	             sum+=a[i];
	         }
	         int ans=0;
	         for(int i=0;i<n;i++)
	         {
	             ans+=a[i]*(sum-a[i]);
	         }
	         System.out.println(ans/2);
	     }
	 }
}