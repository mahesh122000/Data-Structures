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
	 int m=s.nextInt();
	 int a[]=new int[n];
	 for(int i=0;i<n;i++)
	 a[i]=s.nextInt();
	 int b[]=new int[m];
	 for(int j=0;j<m;j++)
	 b[j]=s.nextInt();
	 int k=s.nextInt();
	 HashSet<String>hs=new HashSet<>();
	 PriorityQueue<int[]>pq=new PriorityQueue<>((p,q)->p[0]-q[0]);
	 pq.add(new int[]{a[0]+b[0],0,0});
	 hs.add(0+"$"+0);
	 int prev=0;
	 int i=0;
	 while(i<k)
	 {
	     int x[]=pq.poll();
	     if(prev!=x[0])
	     {
	         i++;
	         prev=x[0];
	     }
	     int p=x[1]+1;
	     if(p<n && !hs.contains(p+"$"+x[2]))
	     {
	         pq.add(new int[]{a[p]+b[x[2]],p,x[2]});
	         hs.add(p+"$"+x[2]);
	     }
	     int q=x[2]+1;
	     if(q<m && !hs.contains(x[1]+"$"+q))
	     {
	         pq.add(new int[]{a[x[1]]+b[q],x[1],q});
	         hs.add(x[1]+"$"+q);
	     }
	 }
	 System.out.println(prev);
	 }
	 }
}