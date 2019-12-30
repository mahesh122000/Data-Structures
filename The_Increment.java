/*You are given a stream of integers represented by an array arr[] of size n. Whenever you encounter an element arr[i], you need to increment its first occurence(on the left side) in the stream by 1 and include the current element in the array. You don't have to do this when you encounter arr[i] for the first time as it is the only occurence till then. Finally, you need to print the updated array.
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
	 int a[]=new int[n];
	 int b[]=new int[n];
	 for(int i=0;i<n;i++)
	 a[i]=s.nextInt();
	 HashMap<Integer,Integer>hm=new HashMap<>();

	 for(int i=0;i<n;i++)
	 {if(hm.containsKey(a[i]))
	 {
	     hm.remove(a[i]+1);
	     int k=hm.get(a[i]);
	     hm.put(a[i]+1,k);
	     b[k]=a[i]+1;
	     hm.put(a[i],i);b[i]=a[i];
	 }
	 else
	 {hm.put(a[i],i);b[i]=a[i];}}
	 for(int i=0;i<n;i++)
	 {if(b[i]!=0)
	 {a[i]=b[i];}}
	 for(int i=0;i<n;i++)
	 {System.out.print(a[i]+" ");}
	     System.out.println();
	 }
	 }
}