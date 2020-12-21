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
	         Queue<Integer>q=new LinkedList<>();
	         int a[]=new int[n];
	         for(int i=1;i<=n;i++)
	         q.add(i);
	         boolean flag=false;
	         one:for(int i=1;i<=n;i++)
	         {
	             two:for(int j=0;j<i;j++)
	             {
	                 if(q.size()==0)
	                 {
	                     flag=true;
	                     break one;
	                 }
	                 int k=q.poll();
	                 q.add(k);
	             }
	             if(q.size()==0)
	             {
	                 flag=true;
	                 break one;
	             }
	             int k=q.poll();
	             a[k-1]=i;
	         }
	         if(flag)
	         {
	             System.out.println("-1");
	             return ;
	         }
	         for(int i=0;i<n;i++)
	         System.out.print(a[i]+" ");
	         System.out.println();
	     }
	 }
}