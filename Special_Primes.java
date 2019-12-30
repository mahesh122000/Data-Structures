/*Given an array arr of  size n of positive integers, the task is to sort all the special primes in their relative position (without affecting the position of other elements).
Special primes are the prime numbers which can be represented as the sum of two other prime numbers.*/
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static boolean isPrime(long n) 
    {
        if (n <= 1) 
            return false; 
        if (n <= 3) 
            return true; 
        if (n % 2 == 0 || n % 3 == 0) 
            return false; 
        for (long i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
                return false; 
        return true; 
    } 
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {int n=s.nextInt();
	 long a[][]=new long[n][2];
	 for(int i=0;i<n;i++)
	 a[i][0]=s.nextLong();
	 int count=0;
	 for(int i=0;i<n;i++)
	 {if(isPrime(a[i][0]))
	 {if(isPrime(a[i][0]-2))
	 {a[i][1]=1;count++;}}}
	 long b[]=new long[count];
	 for(int i=0,j=0;i<n;i++)
	 {if(a[i][1]==1)
	 {b[j]=a[i][0];j++;}}
	 Arrays.sort(b);
	 for(int i=0,j=0;i<n;i++)
	 {if(a[i][1]==1)
	 {System.out.print(b[j]+" ");j++;}
	 else
	 System.out.print(a[i][0]+" ");}
	 System.out.println();}
	 }
}