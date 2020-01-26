import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static void find(int a[][],int r,int c,int n,int m)
     {a[r][c]=0;
     if(r-1>=0 && a[r-1][c]==1)
     {find(a,r-1,c,n,m);}
     if(c-1>=0 && a[r][c-1]==1)
     {find(a,r,c-1,n,m);}
     if(r+1<n && a[r+1][c]==1)
     {find(a,r+1,c,n,m);}
     if(c+1<m && a[r][c+1]==1)
     {find(a,r,c+1,n,m);}
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
	 {String c=s.next();
	 for(int j=0;j<m;j++)
	 {if(c.charAt(j)=='O')
	 a[i][j]=0;
	 else
	 a[i][j]=1;
	 }}
	 int ans=0;
	 for(int i=0;i<n;i++)
	 {for(int j=0;j<m;j++)
	 {int p=i,q=j;
	 if(a[i][j]==1)
	 {find(a,p,q,n,m);
	 ans++;}}}
	 System.out.println(ans);}}
}