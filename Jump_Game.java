 public boolean canJump(int[] nums) {
        if(nums.length==0)
            return true;
        int n=nums.length;
        int p=n-1;
        for(int i=n-2;i>=0;i--)
        {if(i+nums[i]>=p)
        {p=i;}}
       return p==0;
    }