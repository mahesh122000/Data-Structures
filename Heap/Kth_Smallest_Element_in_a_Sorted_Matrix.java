class Solution {
    public int kthSmallest(int[][] a, int k) {
        int n=a.length;
        if(n==0)
            return 0;
        if(a[0].length==0)
            return 0;
        PriorityQueue<Integer>pq=new PriorityQueue<>((p,q)->p-q);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                pq.add(a[i][j]);
            }
        }
        int count=0;
        while(++count<k)
        {
            pq.poll();
        }
        return pq.poll();
    }
}