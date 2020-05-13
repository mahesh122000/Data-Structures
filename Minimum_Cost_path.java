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
	     int a[][]=new int[n][n];
	     for(int i=0;i<n;i++)
	     {for(int j=0;j<n;j++)
	     a[i][j]=s.nextInt();
	     }
	     System.out.println(find(a,n));
	 }
	 }
	 public static int find(int a[][],int n)
	 {
	     Queue<int[]>q=new LinkedList<>();
	     int b[][]=new int[n][n];
	     int c[][]=new int[n][n];
	     q.add(new int[]{0,0});
	     b[0][0]=1;
	     for(int i=0;i<n;i++)
	     {for(int j=0;j<n;j++)
	     c[i][j]=Integer.MAX_VALUE;}
	     c[0][0]=a[0][0];
	     while(!q.isEmpty())
	     {int x[]=q.poll();
	     int i=x[0];
	     int j=x[1];
	     if(i+1<n && c[i+1][j]>c[i][j]+a[i+1][j])
	     {c[i+1][j]=c[i][j]+a[i+1][j];
	     q.add(new int[]{i+1,j});
	     b[i+1][j]=1;}
	     if(j+1<n && c[i][j+1]>c[i][j]+a[i][j+1])
	     {c[i][j+1]=c[i][j]+a[i][j+1];
	     q.add(new int[]{i,j+1});
	     b[i][j+1]=1;}
	     if(i-1>=0 && c[i-1][j]>c[i][j]+a[i-1][j])
	     {c[i-1][j]=c[i][j]+a[i-1][j];
	     q.add(new int[]{i-1,j});
	     b[i-1][j]=1;}
	     if(j-1>=0 && c[i][j-1]>c[i][j]+a[i][j-1])
	     {c[i][j-1]=c[i][j]+a[i][j-1];
	     q.add(new int[]{i,j-1});
	     b[i][j-1]=1;}
	     }
	    return c[n-1][n-1];
    }
}


