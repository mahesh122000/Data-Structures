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
	         n=n*4;
	         int a[][]=new int[n][n];
	         int k=1;
	         for(int i=0;i<n;i++)
	         {
	             for(int j=0;j<n;j++)
	             {
	                 a[i][j]=k;
	                 k++;
	             }
	         }
	         //print clockwise
	         int i=n/2;
	         int j=n/2-1;
	         int h=2;
	         while(h<=n)
	         {
	            for(int r=i;r>=0 && r>i-h;r--)
	            System.out.print(a[r][j]+" ");
	            i-=h;
	            if(i<0)
	            break;
	            for(int c=j;c<n && c<j+h;c++)
	            System.out.print(a[i][c]+" ");
	            j+=h;
	            if(j>=n)
	            break;
	            h+=2;
	            for(int r=i;r<n && r<i+h;r++)
	            System.out.print(a[r][j]+" ");
	            i+=h;
	            if(i>=n)
	            break;
	            for(int c=j;c>0 && c>j-h;c--)
	            System.out.print(a[i][c]+" ");
	            j-=h;
	            if(j<0)
	            break;
	            h+=2;
	         }
	         System.out.println();
	         //print anticlockwise
	         i=n/2-1;
	         j=n/2;
	         h=2;
	         while(h<=n)
	         {
	            for(int r=i;r<n && r<i+h;r++)
	            System.out.print(a[r][j]+" ");
	            i+=h;
	            if(i>n)
	            break;
	            for(int c=j;c>0 && c>j-h;c--)
	            System.out.print(a[i][c]+" ");
	            j-=h;
	            if(j<0)
	            break;
	            h+=2;
	            for(int r=i;r>=0 && r>i-h;r--)
	            System.out.print(a[r][j]+" ");
	            i-=h;
	            if(i<0)
	            break;
	            for(int c=j;c<n && c<j+h;c++)
	            System.out.print(a[i][c]+" ");
	            j+=h;
	            if(j>n)
	            break;
	            h+=2;
	         }
	         System.out.println();  
	     }
	 }
}


 