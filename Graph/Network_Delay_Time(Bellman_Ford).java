class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int a[]=new int[n+1];
        Arrays.fill(a,Integer.MAX_VALUE);
        a[k]=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<times.length;j++)
            {
                int u=times[j][0];
                int v=times[j][1];
                int w=times[j][2];
                if(a[u]!=Integer.MAX_VALUE && a[u]+w<a[v])
                    a[v]=a[u]+w;
            }
        }
        int ans=-1;
        for(int i=1;i<=n;i++)
        {
            if(a[i]==Integer.MAX_VALUE)
                return -1;
            ans=Math.max(ans,a[i]);
        }
        return ans;
    }
}