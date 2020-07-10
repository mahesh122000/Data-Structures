import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static int count;
     static void find(int a,int b)
     {
         if(a<=0)
         count++;
         Queue<Long>q=new LinkedList<>();
         for(long i=1;i<10;i++)
         q.add(i);
         while(!q.isEmpty())
         {
             long n=q.poll();
             if(n<=b)
             {
                 if(n>=a)
                 count++;
                 //System.out.print(n+" ");
                 int k=(int)(n%10);
                 if(k>0)
                 q.add(n*10+k-1);
                 if(k<9)
                 q.add(n*10+k+1);
             }
         }
         //System.out.println();
     }
    
	public static void main (String[] args)
	 {
	     Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0)
	     {
	         int a=s.nextInt();
	         int b=s.nextInt();
	         count=0;
	         find(a,b);
	         System.out.println(count);
	     }
	 }
}
