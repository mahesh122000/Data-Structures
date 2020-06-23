import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static char a[][];
     static int row[]={1,0,-1,0};
     static int col[]={0,1,0,-1};
     static void dfs(int i,int j,int n,int m)
     {
         a[i][j]='P';
         for(int k=0;k<4;k++)
         {
             if(safe(i+row[k],j+col[k],n,m))
             {
                 dfs(i+row[k],j+col[k],n,m);
             }
         }
     }
     static boolean safe(int i,int j,int n,int m)
     {
         if(i<0|j<0|i>=n|j>=m)
         return false;
         if(a[i][j]!='O')
         return false;
         return true;
     }
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {
	     int n=s.nextInt();
	     int m=s.nextInt();
	     a=new char[n][m];
	     for(int i=0;i<n;i++)
	     {
	         for(int j=0;j<m;j++)
	         {
	             a[i][j]=s.next().charAt(0);
	         }
	     }
	     for(int i=0;i<n;i++)
	     {
	         for(int j=0;j<m;j++)
	         {
	             if((i==0 || j==0 ||i==n-1|| j==m-1)&&(a[i][j]=='O'))
	             {
	                 dfs(i,j,n,m);
	             }
	         }
	     }
	     for(int i=0;i<n;i++)
	     {
	         for(int j=0;j<m;j++)
	         {
	             if(a[i][j]=='P')
	             {
	                 a[i][j]='O';
	             }
	             else
	             {
	                 a[i][j]='X';
	             }
	         }
	     }
	     for(int i=0;i<n;i++)
	     {
	         for(int j=0;j<m;j++)
	         {
	             System.out.print(a[i][j]+" ");
	         }
	     }
	     System.out.println();
	 }
	 }
}