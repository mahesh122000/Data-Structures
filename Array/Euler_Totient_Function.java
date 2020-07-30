import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static int gcd(int a,int b)
     {
         if(b==0)
         return a;
         return gcd(b,a%b);
     }
	public static void main (String[] args)
	 {
	     Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0)
	     {
	         int n=s.nextInt();
	         int ans=1;
	         for(int i=2;i<n;i++)
	         {
	             if(gcd(n,i)==1)
	             ans++;
	         }
	         System.out.println(ans);
	     }
	 }
}