/*Given an array arr[] of size N initialized with all 0s and another array query[] of size Q, every query consists of an integer query[i] which is an index (0 based) in the given array. The task is to decrement the element arr[query[i]] by 1 if query[i] is a valid index else update all the array values to the minimum of all the elements from the same array. Finally, print the updated array.
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
	 int a[]=new int[n];
	 int min=0;
	 for(int i=0;i<k;i++)
	 {int p=s.nextInt();
	 if(p>=n)
	 {for(int j=0;j<n;j++)
	 {a[j]=min;}}
	 else
	 {a[p]=a[p]-1;
	 if(a[p]<min)
	 min=a[p];}}
	 for(int i=0;i<n;i++)
	 System.out.print(a[i]+" ");
	 System.out.println();}
	 }
}