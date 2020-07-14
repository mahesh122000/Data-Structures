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
    //function to check if repetetions are present in a number or not.
    static boolean possible(long n)
    {
        int a[]=new int[10];
        while(n>0)
        {
            int k=(int)n%10;
            if(a[k]==1)
            return false;
            a[k]=1;
            n=n/10;
        }
        return true;
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
		ArrayList<Long>al=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if((i>=j &&i<=n-1-j)||(j>=n-i-1 && j>=i))//shaded region.
		        {
		            //System.out.print(a[i][j]+" ");
		            if(possible(a[i][j]))
		            al.add(a[i][j]);
		        }
		        else
		        {//System.out.print(" ");
		        }
		    }
		    //System.out.println();
		}
		//printing result.
		    for(Long i:al)
		    System.out.print(i+" ");
		    System.out.println();   
	}
}



/*
Output: for n=20


1 28674 3 6 6 9 13 28679 14 18 24 6789 18 21 25 31 40 10978 28691 29 32 36 42 51 65 6807 42 45 49 64 78 1649 2637 4235 6820 28715 59 62 72 81 95 152 2654 6837 82 85 89 95 104 140 175 231 1078 1689 4275 120 126 135 149 206 352 497 731 1720 2708 4306 6891 17839 150 153 157 163 172 186 208 243 389 534 768 2745 6928 194 198 204 213 249 284 340 809 1798 2786 234 237 241 247 256 270 327 1230 7012 17960 28907 281 284 294 317 2876 7059 28954 341 347 356 370 4527 395 398 402 408 417 29068 462 465 469 475 7240 29135 536 540 18259 609 689 


*/