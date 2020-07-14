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
    //function to tell is the number is in ascending order or not.
    static boolean possible(long n)
    {
        /*All ascending numbers including single digit elements are included.
        if single digit elements shouldn't be included then remove the comments of the condition that n>=10  */
        
        
        
      //  if(n<10)
     //   return false;
     
        ArrayList<Integer>al=new ArrayList<>();
        while(n>0)
        {
            al.add(0,(int)n%10);
            n=n/10;
        }
        
        // only strict ascending numbers are choosen, if ascending numbers with common elements to be choosen
        //then remove equality symbol in comparision.
        for(int i=1;i<al.size();i++)
        {
            if(al.get(i-1)>=al.get(i))//remove equality to enable not strictly ascending numbers.
            return false;
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
		        {}
		        else
		        {
		            if(possible(a[i][j]))
		            al.add(a[i][j]);
		        }
		    }
		}
		//printing result.
		for(Long i:al)
		System.out.print(i+" ");
	}
}
/*
Output: for n=20

4 8 14 23 37 59 16 25 39 19 28 245 47 69 167 257 178 268 135 1458 569 

*/