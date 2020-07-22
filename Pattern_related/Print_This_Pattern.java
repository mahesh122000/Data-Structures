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
	         int k=2*n-1;
	         int a[][]=new int[k][k];
	         int m=n;
	         for(int i=0;i<=k/2;i++)
	         {
	             for(int j=i;j<k-i;j++)
	             {
	                 a[i][j]=m;
	                 a[k-1-i][j]=m;
	             }
	             m--;
	         }
	         m=n;
	         for(int j=0;j<=k/2;j++)
	         {
	             for(int i=0;i<k;i++)
	             {
	                 if(a[i][j]==0)
	                 {
	                     a[i][j]=m;
	                     a[i][k-1-j]=m;
	                 }
	             }
	             m--;
	         }
	         for(int i=0;i<k;i++)
	         {
	             for(int j=0;j<k;j++)
	             {
	                 System.out.print(a[i][j]);
	             }
	             System.out.println();
	         }
	     }
	 }
}