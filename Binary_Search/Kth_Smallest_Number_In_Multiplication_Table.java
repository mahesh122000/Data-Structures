class Solution {
    public int findKthNumber(int m, int n, int k) {
        int l=1;
        int r=m*n;
        int ans=0;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            int count=find(m,n,mid);
            if(count>=k)
            {
                ans=mid;
                r=mid-1;
            }
            else
                l=mid+1;
        }
        return ans;
    }
    int find(int m,int n,int k)
    {
        int count=0;
        for(int i=1;i<=m;i++)
        {
            int v=i*n;
            count+=Math.min(v,k)/i;
        }
        return count;
    }
}