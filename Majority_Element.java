public int majorityElement(int[] nums) {
        int n=nums.length;
        if(n==0)
            return 0;
        int i=0;
        int m=0;
        for(int j=0;j<n;j++)
        {if(i==0)
        {m=nums[j];
        i++;}
        else if(m==nums[j])
            i++;
        else
         i--;}
        return m;
    }