class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int n=nums.length;
        if(n==0)
            return 0;
        int left=0,min=Integer.MAX_VALUE;
        int val=0;
        for(int right=0;right<n;right++)
        {val+=nums[right];
        while(val>=s && left<=right)
        {min=Math.min(min,right-left+1);
        val-=nums[left];
        left++;}}
        if(min==Integer.MAX_VALUE)
            return 0;
         return min;
        
    }
}