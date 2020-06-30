import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static int a[][];
     static int ans;
	public static void main (String[] args)
	 {
	     Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0)
	     {
	        int n=s.nextInt();
	        a=new int[n][n];
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<n;j++)
	            {
	                a[i][j]=s.nextInt();
	            }
	        }
	        int b[]=new int[n];
	        ans=find(b,0,1,n);
	        System.out.println(ans);
	     }
	 }
	 static int find(int b[],int i,int count,int n)
	 {
	     b[i]=1;
	     int val=0,ans=Integer.MAX_VALUE;
	     for(int j=0;j<n;j++)
	     {
	         if(b[j]==0 && a[i][j]>0)
	         {
	             val=a[i][j]+find(b,j,count+1,n);
	             ans=Math.min(ans,val);
	         }
	     }
	     b[i]=0;
	     if(ans==Integer.MAX_VALUE)
	     return a[i][0];
	     else
	     return ans;
	 }
 }