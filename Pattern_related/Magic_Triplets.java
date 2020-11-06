class Solution{
    public int countTriplets(int[] nums){
        int l=0,r=0,c1=0,c2=0;
        int ans=0;
        for(int i=1;i<nums.length-1;i++)
        {
            l=i-1;
            r=i+1;
            c1=c2=0;
            while(l>=0)
            {
                if(nums[i]>nums[l])
                c1++;
                l--;
            }
            while(r<nums.length)
            {
                if(nums[i]<nums[r])
                c2++;
                r++;
            }
            ans+=c1*c2;
        }
        return ans;
    }
}