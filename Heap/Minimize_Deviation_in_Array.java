class Solution {
    public int minimumDeviation(int[] a) {
        int n=a.length;
        int min=Integer.MAX_VALUE;
        PriorityQueue<Integer>pq=new PriorityQueue<>((p,q)->q-p);
        for(int i:a)
        {
            if(i%2==1)
                i*=2;
            pq.add(i);
            min=Math.min(i,min);
        }
        int ans=Integer.MAX_VALUE;
        while(pq.size()==n)
        {
            int p=pq.poll();
            ans=Math.min(ans,p-min);
            if(p%2==0)
            {
                p=p/2;
                min=Math.min(min,p);
                pq.add(p);
            }
        }
        return ans;
    }
}