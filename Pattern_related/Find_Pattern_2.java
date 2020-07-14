/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    // function for filling the array with prime numbers without ending with 9.
    static void find(long a[],int n)
    {
        a[0]=2;
        a[1]=3;
        long val=3;
        int i=2;
        for(;i<a.length;)
        {
            val=prime(val);
            if(val%10!=9)
            {a[i]=val;i++;}
        }
    }
    // function to find next prime number using current prime number as input.
    static long prime(long n)
    {
        for(long i=n+1;;i++)
        {
            boolean flag=true;
            one:for(long j=2;j<=(long)Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    flag=false;
                    break one;
                }
            }
            if(flag==true)
            return i;
        }
    }
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		long a[][]=new long[n][n];
		long b[]=new long[2*n];
		find(b,n);
		for(int j=0;j<1;j++)
		{
		    for(int i=0;i<n;i++)
		    {
		        if(i==0 && j==0)
		        a[i][j]=1;
		        else
		        {
		            a[i][j]=a[i-1][j]+b[i-1];
		        }
		    }
		}
		for(int i=0;i<n;i++)
		{
		    int k=0;
		    long c[]=new long[2];
		    c[0]=3;
		    c[1]=4;
		    for(int j=1;j<n;j++)
		    {
		      a[i][j]=a[i][j-1]+c[k];
		      c[k]=c[k%2]+c[(k+1)%2]-1;
		      k++;
		      k=k%2;
		    }
		}
		//arraylist to store the values in shaded region.
		ArrayList<Long>al=new ArrayList<>();
		for(int j=0;j<n;j++)
		{al.add(a[0][j]);//first row elements
		al.add(a[n-1][j]);//second row elements.
		}
		//diagonal elements
		for(int i=1;i<n-1;i++)
		{
		    for(int j=1;j<n-1;j++)
		    {
		        if(i==j)
		        al.add(a[i][j]);
		        if(i==n-1-j)
		        al.add(a[i][j]);
		    }
		}
		//sorting the arraylist in descending order.
		Collections.sort(al,Collections.reverseOrder());
		//printing the result.
		for(Long i:al)
		System.out.print(i+" ");
	}
}
/*
Output: for n=20


29362 28674 18415 18332 17729 17727 11649 11493 10966 10961 7467 7240 6789 6779 4882 4588 4211 4194 3284 2929 2624 2596 2296 1888 1685 1649 1608 1307 1230 1073 1055 997 928 838 809 782 747 725 711 702 700 696 692 689 619 609 540 534 497 475 417 389 385 370 352 340 339 327 240 231 152 150 100 94 65 59 40 37 24 23 14 13 8 6 4 1 



*/