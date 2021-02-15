class Solution {
    public int[] kWeakestRows(int[][] a, int k) {
        int n=a.length;
        int m=a[0].length;
        PriorityQueue<int[]>pq=new PriorityQueue<>((p,q)->p[0]==q[0]?p[1]-q[1]:p[0]-q[0]);
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<m;j++)
            {
                if(a[i][j]==1)
                    count++;
                else
                    break;
            }
            pq.add(new int[]{count,i});
        }
        int ans[]=new int[k];
        int i=0;
        while(k-->0)
        {
            int x[]=pq.poll();
            ans[i++]=x[1];
        }
        return ans;
    }
}