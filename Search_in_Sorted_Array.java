 public int search(int[] nums, int target) {
        int n=nums.length;
        if(n==0 || nums==null)
            return -1;
        int l=0,r=n-1;
        while(l<r)
        {int m=(l+r)>>1;
        if(nums[m]>=nums[r])
         l=m+1;
        else 
         r=m;}
        if(target<=nums[n-1])
            return bs(nums,target,l,n-1);
        else
            return bs(nums,target,0,l);
    }
    int bs(int a[],int x,int l,int r)
    {
        while(l<=r)
        {int m=(l+r)>>1;
        if(a[m]==x)
         return m;
        else if(a[m]>x)
            r=m-1;
        else
         l=m+1;}
        return -1;
    }