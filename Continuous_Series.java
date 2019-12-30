/*
Given an array arr of size n containing only distinct integers, you need to find total times you see a series of consecutive integers of length greater than 1.
A series of consecutive integers is defined as arr[i], arr[i]+1, arr[i]+2...and so on.
*/
Import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	     Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {int n=s.nextInt();
	 long a[]=new long[n];
	 for(int i=0;i<n;i++)
	 a[i]=s.nextLong();
	 int count=0,countx=0;
	 long k=a[0];
	 for(int i=1;i<n;i++)
	 {
	     if(a[i]==k+1)
	 {countx++;
	 k=a[i];}
	 else
	 {k=a[i];
	 if(countx>0)
	 {count++;}
	 countx=0;
	 }}
	 if(countx>0)
	 count++;
	 System.out.println(count);}}
}