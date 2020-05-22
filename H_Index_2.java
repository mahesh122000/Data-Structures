class Solution {
    public int hIndex(int[] a) {
        int n=a.length;
        int l=0;
        int h=n-1;
        int ans=0;
        if(n==0)
            return 0;
        if(n==1)
            return a[0]==0?0:1;
        while(l<=h)
        {
            int m=(l+h)>>1;
            int k=a[m];
            if(k>=n-m)
            {ans=Math.max(ans,n-m);
            h=m-1;}
            else
            l=m+1;
        }
        return ans;
    }
}