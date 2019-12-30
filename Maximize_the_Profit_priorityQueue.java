/* Given the vacant seats of N rows of a theatre represented by an array row[], maximize the profit that can be made by selling the tickets to K people waiting in a queue. The cost of a seat in the ith row is the number of current vacant seats in the ith row.
Note: It could be possible that number of people are greater than the available vacant seats, and hence it may not be possible to seat all people.
/*
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
	 {int n=s.nextInt();
	 int k=s.nextInt();
	 PriorityQueue<Long> pq = new PriorityQueue<>(20,Collections.reverseOrder());
	 long a[]=new long[n];
	 for(int i=0;i<n;i++)
	 {a[i]=s.nextLong();pq.add(a[i]);}
	 long ans=0;
	 for(int i=0;i<k;i++)
	 {ans=ans+pq.peek();
	 long kk=pq.peek();
	 pq.remove(kk);
	 kk--;
	 pq.add(kk);}
	 System.out.println(ans);}
	 }
}