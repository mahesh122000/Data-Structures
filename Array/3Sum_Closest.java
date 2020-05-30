class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans=0;
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            int l=i+1;
            int h=n-1;
            while(l<h)
            {
                int sum=nums[i]+nums[l]+nums[h];
                if(sum==target)
                    return target;
                if(Math.abs(sum-target)<min)
                {
                    ans=sum;
                    min=Math.abs(sum-target);
                }
                if(sum<target)
                    l++;
                else
                    h--;
            }
        }
        return ans;
    }
}