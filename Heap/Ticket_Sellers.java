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
	         int k=s.nextInt();
	         PriorityQueue<Integer>pq=new PriorityQueue<>((p,q)->q-p);
	         for(int i=0;i<n;i++)
	         pq.add(s.nextInt());
	         long ans=0;
	         long mod=1000000007;
	         while(k-->0)
	         {
	             if(pq.isEmpty())
	             break;
	             int temp=pq.poll();
	             ans+=temp;
	             ans=ans%mod;
	             if(temp>=1)
	             pq.add(temp-1);
	         }
	         System.out.println(ans);
	     }
	 }
}