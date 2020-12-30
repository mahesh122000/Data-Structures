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
	         int count=0;
	         for(int i=0;i<n;i++)
	         {
	             int val=0;
	             for(int j=0;j<n;j++)
	             {
	                 int k=s.nextInt();
	                 if(k==1)
	                 val++;
	             }
	             if(val%2==1)
	             count++;
	         }
	         if(count==2)
	         System.out.println("1");
	         else
	         System.out.println("0");
	     }
	 }
}


/*
Simply we need to find whether the given graph is semi-eulerian Graph or not , it true print 1 else print 0.
The condition for semi eulerian graph is that , the count of odd degree vertices are 2.
*/
