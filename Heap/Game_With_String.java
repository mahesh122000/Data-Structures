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
	         String c=s.next();
	         int n=s.nextInt();
	         int a[]=new int[26];
	         for(int i=0;i<c.length();i++)
	         {
	             a[c.charAt(i)-'a']++;
	         }
	         PriorityQueue<Integer>pq=new PriorityQueue<>((p,q)->q-p);
	         for(int i=0;i<26;i++)
	         pq.add(a[i]);
	         while(n-->0 && !pq.isEmpty())
	         {
	             int k=pq.poll();
	             k--;
	             if(k>=0)
	             pq.add(k);
	         }
	         int ans=0;
	         while(!pq.isEmpty())
	         {int k=pq.poll();
	         ans+=k*k;
	         }
	         System.out.println(ans);
	     }
	 }
}