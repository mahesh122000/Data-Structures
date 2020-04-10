static long find(long length[], int n) 
	{ 
	    PriorityQueue<Long>pq=new PriorityQueue<>();
	    for(int i=0;i<n;i++)
	    pq.add(length[i]);
	    long ans=0;
	    while(!pq.isEmpty() && pq.size()>1)
	    {long k=pq.poll()+pq.poll();
	    ans+=k;
	    pq.add(k);
	    }
	    return ans;
	} 
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {int n=s.nextInt();
	 long a[]=new long[n];
	 for(int i=0;i<n;i++)
	 a[i]=s.nextLong();
	 System.out.println(find(a,n));
	 }
	 }