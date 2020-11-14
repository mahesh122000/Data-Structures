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
	         int i=s.nextInt();
	         if(find(n,i))
	         System.out.println("Doctor");
	         else
	         System.out.println("Engineer");
	     }
	 }
	 static boolean find(int n,int i)
	 {
	     if(i==0)
	     return true;
	     if(n==1||i==1)
	     return false;
	     int m=(int)(Math.pow(2,n-1))/2;
	     if(i<=m)
	     return find(n-1,i);
	     else
	     return !find(n-1,i-m);
	 }
}