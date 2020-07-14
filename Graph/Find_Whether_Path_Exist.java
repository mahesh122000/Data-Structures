import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static int row[]={0,1,0,-1};
     static int col[]={1,0,-1,0};
    public static boolean find(int a[][],int d,int e,int p,int q,int n,int b[][])
    {
        if(d==p && q==e)
        return true;
        b[d][e]=1;
        for(int k=0;k<4;k++)
        {
            if(safe(d+row[k],e+col[k],b,n,a))
            {
                if(find(a,d+row[k],e+col[k],p,q,n,b))
                return true;
            }
        }
        return false;
    }
    static boolean safe(int i,int j,int b[][],int n,int a[][])
    {
        if(i<0||j<0||i>=n||j>=n||b[i][j]==1||a[i][j]==0)
        return false;
        return true;
    }
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {int n=s.nextInt();
	 int a[][]=new int[n][n];
	 int p=0,q=0,d=0,e=0;
	 for(int i=0;i<n;i++)
	 {for(int j=0;j<n;j++)
	 {a[i][j]=s.nextInt();
	 if(a[i][j]==1)
	     {p=i;q=j;}
	 if(a[i][j]==2)
	     {d=i;e=j;}
	 }}
	 int b[][]=new int[n][n];
	 if(find(a,p,q,d,e,n,b))
	 System.out.println("1");
	 else
	 System.out.println("0");}
	 }
}