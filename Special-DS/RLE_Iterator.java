class RLEIterator {
    static HashMap<Long,Integer>hm;
    static Queue<Long>q;
    static long sum;
    static long cur;
    public RLEIterator(int[] A) {
        hm=new HashMap<>();
        sum=0;
        cur=0;
        q=new LinkedList<>();
        int i=0;
        while(i<A.length)
        {
            if(A[i]!=0)
            {
                sum+=A[i];
                q.add(sum);
                hm.put(sum,A[i+1]);
            }
            i+=2;
        }
    }
    
    public int next(int n) {
        cur+=n;
        if(cur>sum)
        {
            return -1;
        }
        while(!q.isEmpty() && cur>q.peek())
        {
            q.poll();
        }
        return q.isEmpty()?-1:hm.get(q.peek());
    }
}

