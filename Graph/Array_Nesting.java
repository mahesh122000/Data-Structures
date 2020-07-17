class Solution {
    static int ans;
    public int arrayNesting(int[] nums) {
        ans=0;
        int n=nums.length;
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(b[i]!=1)
            {
                b[i]=1;
                find(nums,b,nums[i],1);
            }
        }
        return ans;
    }
    void find(int a[],int b[],int i,int l)
    {
        if(b[i]==1)
        {
            ans=Math.max(ans,l);
            return;
        }
        b[i]=1;
        find(a,b,a[i],l+1);
    }
}