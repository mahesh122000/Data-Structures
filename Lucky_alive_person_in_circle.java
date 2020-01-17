import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static long ans(long n)
    {
        int p = (int)(Math.log(n)/Math.log(2));
        return (long)Math.pow(2, p); 
    }
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {long n=s.nextLong();
	 long k=2*(n-ans(n)+1)-1;
	 System.out.println(k);
	 }
}}