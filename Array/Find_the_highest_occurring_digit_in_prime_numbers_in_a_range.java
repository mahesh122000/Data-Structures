import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     
     static boolean arr[]=new boolean[1000001];
     static void convert(int a[],int n)
     {
         while(n>0)
         {
             a[n%10]++;
             n=n/10;
         }
     }
	public static void main (String[] args)
	 {
	     Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     Arrays.fill(arr,true);
         for(int p=2;p<=Math.sqrt(1000000);p++)
          {
               for(int i=p*p;i<=1000000;i+=p)
               {
                   arr[i]=false;
               }
          }
	     while(t-->0)
	     {
	         int l=s.nextInt();
	         int r=s.nextInt();
	         int a[]=new int[10];
	         for(int i=l;i<=r;i++)
	         {
	             if(arr[i])
	             {
	                 convert(a,i);
	             }
	         }
	         int max=1;
	         int ind=-1;
	         for(int i=0;i<10;i++)
	         {
	             if(a[i]>=max)
	             {
	                 max=a[i];
	                 ind=i;
	             }
	         }
	         System.out.println(ind);
	     }
	 }
}