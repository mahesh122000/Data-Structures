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
	         for(int i=0;i<n;i++)
	         a[i]=s.nextInt();
	         int k=0;
	         if(n%2==1)
	         k=(int)Math.floor((n-3)/4)+2;
	         else
	         k=(int)Math.floor((n-2)/4)+1;
	         if(n==1)
	         k=0;
	         System.out.println(a[k]);
	     }
	 }
}