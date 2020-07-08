import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static String ans;
	public static void main (String[] args)
	 {
	     Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0)
	     {
	         long n=s.nextInt();
	         String ans=find(n);
	         System.out.println(ans);
	     }
	 }
	 static String find(long n)
	 {
	     if(n==1)
	     return "1";
	     int v=9;
	     String ans="";
	     while(v>=1)
	     {
	         if(v==1 && n!=1)
	         return "-1";
	         if(n==1)
	         break;
	         if(n%v==0)
	         {
	             n=n/v;
	             ans=v+ans;
	         }
	         else
	         {
	             v--;
	         }
	     }
	     return ans;
	 }
}



