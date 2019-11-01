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
	 {int n=s.nextInt();
	 int a[]=new int[n];
	 int k=s.nextInt();
	 int sum=0,j=0,min=99999;;
	 for(int i=0;i<n;i++)
	 {a[i]=s.nextInt();}
	 for(int i=0;i<n;i++)
	 {sum+=a[i];
	     while(sum>k)
	  {min=Math.min(min,i-j+1);
	      sum-=a[j];j++;}
	 }
	 System.out.println(min);}
	 }
}