class Solution {
    public int[] kthSmallestPrimeFraction(int[] a, int k) {
        int n=a.length;
        PriorityQueue<int[]>pq=new PriorityQueue<>((p,q)->a[p[0]]*a[q[1]]-a[p[1]]*a[q[0]]);
        for(int i=0;i<n-1;i++)
            pq.add(new int[]{i,n-1});
        for(int i=0;i<k-1;i++)
        {
            int x[]=pq.poll();
            if(x[0]<x[1]-1)
            {
                pq.add(new int[]{x[0],x[1]-1});
            }
        }
        int x[]=pq.poll();
        return new int[]{a[x[0]],a[x[1]]};
    }
}