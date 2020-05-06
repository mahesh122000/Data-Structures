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
	     find(a,n);
	     System.out.println();
	 }
	 }
	 static class Int
	 {
	     int data;
	     Int(int v)
	     {
	         this.data=v;
	     }
	 }
	 static void find(int a[],int n)
	 {
	     Int p=new Int(0);
	     int min=Integer.MIN_VALUE;
	     int max=Integer.MAX_VALUE;
	     tree(a,min,max,p,n);
	 }
	 static void tree(int a[],int min,int max,Int p,int n)
	 {
	     if(p.data==n)
	     return ;
	     int v=a[p.data];
	     if(v<=min ||v>=max)
	     return;
	     p.data++;
	     tree(a,min,v,p,n);
	     tree(a,v,max,p,n);
	     System.out.print(v+" ");
	 }
}