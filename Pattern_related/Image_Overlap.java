class Solution {
    public int largestOverlap(int[][] a, int[][] b) {
        int n=a.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int m1=0,m2=0;
                for(int r=0;r<n;r++)
                {
                    for(int s=0;s<n;s++)
                    {
                        if(r+i<n && s+j<n)
                        {
                            if(a[r+i][s+j]==1 && b[r][s]==1)
                                m1++;
                            if(b[r+i][s+j]==1 && a[r][s]==1)
                                m2++;
                        }
                    }
                }
                ans=Math.max(ans,Math.max(m1,m2));
            }
        }
        return ans;
    }
}