 public int findPeakElement(List<Integer> a)
    {
        int n=a.size();
        int l=0,r=n-1;
        int ans=0;
        while(l<=r)
        {
            int m=(l+r)/2;
            if(m<n-1 && a.get(m)<a.get(m+1))
            {
                ans=Math.max(ans,a.get(m));
                l=m+1;
            }
            else if(m<n-1 && a.get(m)>a.get(m+1))
            {
                ans=Math.max(ans,a.get(m));
                r=m-1;
            }
        }
        return ans;
    }