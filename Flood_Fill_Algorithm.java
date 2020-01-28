import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static void fill(int a[][],int r,int c,int n,int m,int k,int p)
     {a[r][c]=p;
     if(r-1>=0 && a[r-1][c]==k)
     {fill(a,r-1,c,n,m,k,p);}
     if(r+1<n && a[r+1][c]==k)
     {fill(a,r+1,c,n,m,k,p);}
     if(c-1>=0 && a[r][c-1]==k)
     {fill(a,r,c-1,n,m,k,p);}
     if(c+1<m && a[r][c+1]==k)
     {fill(a,r,c+1,n,m,k,p);}
     }
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {int n=s.nextInt();
	 int m=s.nextInt();
	 int a[][]=new int[n][m];
	 for(int i=0;i<n;i++)
	 {for(int j=0;j<m;j++)
	 a[i][j]=s.nextInt(); 
	 }
	 int p=s.nextInt();
	 int q=s.nextInt();
	 int k=s.nextInt();
	 int kk=a[p][q];
	 fill(a,p,q,n,m,kk,k);
	 for(int i=0;i<n;i++)
	 {for(int j=0;j<m;j++)
	 {System.out.print(a[i][j]+" ");}}
	     System.out.println();
	 }}}