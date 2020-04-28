 public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<32;i++)
        {
            int x=1<<i;
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if((nums[j]&x)!=0)
                    count++;
            }
            if(count%3!=0)
                ans=ans|x;
        }
        return ans;
    }