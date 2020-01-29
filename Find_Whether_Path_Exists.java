import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static boolean find(int a[][],int r,int c,int n,int m)
    {a[r][c]=0;
    boolean flag1=false,flag2=false,flag3=false,flag4=false;
    if(r-1>=0)
    {if(a[r-1][c]==2)
    flag1=true;
    else if(a[r-1][c]==3)
    flag1=find(a,r-1,c,n,m);
    }
    if(r+1<m)
    {if(a[r+1][c]==2)
    flag2=true;
    else if(a[r+1][c]==3)
    flag2=find(a,r+1,c,n,m);
    }
    if(c-1>=0)
    {if(a[r][c-1]==2)
    flag3=true;
    else if(a[r][c-1]==3)
    flag3=find(a,r,c-1,n,m);
    }
    if(c+1<m)
    {if(a[r][c+1]==2)
    flag4=true;
    else if(a[r][c+1]==2)
    flag4=find(a,r,c+1,n,m);
    }
    return flag1||flag2||flag3||flag4;
    }
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {int n=s.nextInt();
	 int a[][]=new int[n][n];
	 int p=0,q=0;
	 for(int i=0;i<n;i++)
	 {for(int j=0;j<n;j++)
	 {a[i][j]=s.nextInt();
	 if(a[i][j]==1)
	     {p=i;q=j;}
	 }}
	 if(find(a,p,q,n,n))
	 System.out.println("1");
	 else
	 System.out.println("0");}
	 }
}