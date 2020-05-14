class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {int k=s.nextInt();
	 int n=s.nextInt();
	 PriorityQueue<Integer>pq=new PriorityQueue<>();
	 for(int i=0;i<n;i++)
	 {int m=s.nextInt();
	 if(pq.size()<k)
	 {pq.add(m);
	 if(pq.size()==k)
	 System.out.print(pq.peek()+" ");
	 else
	 System.out.print("-1 ");
	 }
	 else if(pq.size()==k && pq.peek()<m)
	 {pq.poll();
	 pq.add(m);
	 System.out.print(pq.peek()+" ");
	 }
	 else
	 System.out.print(pq.peek()+" ");
	 }
	 System.out.println();
	 }
	 }
	 
}
