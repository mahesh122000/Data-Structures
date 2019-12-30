/*
You are given a square matrix S[][] of size N*N, initially filled with 0’s. There will be K queries. Each query contains two numbers R and C representing the row and column respectively, and both R and C use 1 based indexing.
For each query, you need to add 1 to each cell of the matrix from (1,1) to (R,C).
At the end, you need to find the count of integers that are strictly smaller than the max number in the matrix.
/*
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
	 {int n=s.nextInt();
	 int k=s.nextInt();
	 int r[]=new int[n];
	 int c[]=new int[n];
	 for(int i=0;i<k;i++)
	 {int p=s.nextInt();
	 int q=s.nextInt();
	 r[p-1]+=1;
	 c[q-1]+=1;}
	 int max=0;
	 for(int i=n-2;i>=0;i--)
	 r[i]=r[i]+r[i+1];
	 for(int i=n-2;i>=0;i--)
	 c[i]=c[i]+c[i+1];
	 for(int i=0;i<n;i++)
	 {if(r[i]>max)
	 max=r[i];}
	 int p=0;
	 int q=0;
//	 for(int i=0;i<n;i++)
//	 System.out.print(r[i]+" ");
//	 System.out.println();
	 for(int i=n-1;i>=0;i--)
	 {if(r[i]==max)
	 {p=i+1;break;}}
	 for(int i=n-1;i>=0;i--)
	 {if(c[i]==max)
	 {q=i+1;break;}}
	 System.out.println(n*n-p*q);}
	 }
}