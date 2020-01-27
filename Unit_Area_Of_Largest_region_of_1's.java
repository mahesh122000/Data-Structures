import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static int find(int a[][],int r,int c ,int n,int m)
    {int count=1;
    a[r][c]=0;
    if(r-1>=0 && a[r-1][c]==1)
    {count+=find(a,r-1,c,n,m);}
    if(c-1>=0 && a[r][c-1]==1)
    {count+=find(a,r,c-1,n,m);}
    if(r+1<n && a[r+1][c]==1)
    {count+=find(a,r+1,c,n,m);}
    if(c+1<m && a[r][c+1]==1)
    {count+=find(a,r,c+1,n,m);}
    if(r-1>=0 && c-1>=0 && a[r-1][c-1]==1)
    {count+=find(a,r-1,c-1,n,m);}
    if(r-1>=0 && c+1<m && a[r-1][c+1]==1)
    {count+=find(a,r-1,c+1,n,m);}
    if(r+1<n && c-1>=0 && a[r+1][c-1]==1)
    {count+=find(a,r+1,c-1,n,m);}
    if(r+1<n && c+1<m && a[r+1][c+1]==1)
    {count+=find(a,r+1,c+1,n,m);}
    return count;}
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
	 a[i][j]=s.nextInt();}
	 int count=0, max=0;
	 for(int i=0;i<n;i++)
	 {for(int j=0;j<m;j++)
	 {if(a[i][j]==1)
	 count=find(a,i,j,n,m);
	 if(max<count)
	 max=count;
	 }}
	 System.out.println(max);}
	 }
}