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
	         int m=2*n-1;
	         char a[][]=new char[n][m];
	         for(int i=0;i<n;i++)
	         {
	             Arrays.fill(a[i],'*');
	         }
	         for(int i=0;i<n;i++)
	         {
	             for(int j=0;j<i;j++)
	             {
	                 a[i][j]=' ';
	                 a[i][m-j-1]=' ';
	             }
	         }
	         for(int i=0;i<n;i++)
	         {
	             for(int j=0;j<m;j++)
	             {
	                 System.out.print(a[i][j]);
	             }
	         }
	         System.out.println();
	     }
	 }
}