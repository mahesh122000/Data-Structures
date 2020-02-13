import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static void find(int a[][],int n,int m,int r,int c,Queue<int []>q)
    {a[r][c]=0;
    if(r+1<n && a[r+1][c]==1)
    {a[r+1][c]=2;
    q.add(new int[] {r+1,c});}
    if(r-1>=0 && a[r-1][c]==1)
    {a[r-1][c]=2;
    q.add(new int[] {r-1,c});}
    if(c+1<m && a[r][c+1]==1)
    {a[r][c+1]=2;
    q.add(new int[] {r,c+1});}
    if(c-1>=0 && a[r][c-1]==1)
    {a[r][c-1]=2;
    q.add(new int[] {r,c-1});}
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
	 a[i][j]=s.nextInt();}
	 Queue<int []>q=new LinkedList<>();
	 int total=0;
	 for(int i=0;i<n;i++)
	 {for(int j=0;j<m;j++)
	 {if(a[i][j]>=1)
	 total++;
	 if(a[i][j]==2)
	 q.add(new int []{i,j});
	 }
	 }
	 int count=0;
	 int time=0;
	 while(!q.isEmpty())
	 {count+=q.size();
	 int si=q.size();
	 while(si--!=0)
	 {int x[]=q.peek();
	 q.remove();
	 find(a,n,m,x[0],x[1],q);
	 }
	 time++;
	 }
	 if(count-total==0)
	 System.out.println(time-1);
	 else
	 System.out.println("-1");
	 }
	 }
}