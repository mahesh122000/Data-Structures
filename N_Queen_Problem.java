import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static int n;
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {int nn=s.nextInt();
	 n=nn;
	 solve();
	 System.out.println();
	 }
	 }
	static void solve()
	{
	    int a[][]=new int[n][n];
	    if(solveNQ(a,0)==false)
	    System.out.print("-1");
	}
	static boolean solveNQ(int a[][],int col)
	{
	    if(col==n)
	    {print(a);
	    return true;
	    }
	    boolean res=false;
	    for(int i=0;i<n;i++)
	    {if(isSafe(a,i,col))
	    {a[i][col]=1;
	    res=solveNQ(a,col+1)||res;
	    a[i][col]=0;
	    }}
	    return res;
	}
	static boolean isSafe(int a[][],int row,int col)
	{
	    for(int i=0;i<col;i++)
	    {if(a[row][i]==1)
	    return false;
	    }
	    for(int i=row,j=col;j>=0 &&i>=0;i--,j--)
	    {if(a[i][j]==1)
	    return false;
	    }
	    for(int i=row,j=col;j>=0 &&i<n;i++,j--)
	    {if(a[i][j]==1)
	    return false;
	    }
	    return true;
	}
	static void print(int a[][])
	{
	    System.out.print("[");
	    for(int i=0;i<n;i++)
	    {for(int j=0;j<n;j++)
	    {if(a[j][i]==1)
	    System.out.print(j+1+" ");
	    }}
	    System.out.print("] ");
	}
}