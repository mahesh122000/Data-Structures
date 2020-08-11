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
	     int m=s.nextInt();
	     int a[][]=new int[n][m];
	     for(int i=0;i<n;i++)
	     {for(int j=0;j<m;j++)
	     a[i][j]=s.nextInt();
	     }
	     find(a,n,m);
	 }
	 }
	 static void find(int a[][],int n,int m)
	 {
	     int i=0,j=0,d=0;
	     int p_x=0,p_y=0;
	     while(i<n && j<m && i>=0 && j>=0)
	     {
	         p_x=i;
	         p_y=j;
	         if(a[i][j]==1)
	         d=(d+1)%4;
	         a[i][j]=0;
	         if(d==0)
	         j++;
	         else if(d==1)
	         i++;
	         else if(d==2)
	         j--;
	         else
	         i--;
	     }
	     System.out.println(p_x+" "+p_y);
	 }
}