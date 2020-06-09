class Solution {
    static int b[];
    public boolean circularArrayLoop(int[] nums) {
        int n=nums.length;
        b=new int[n];
        for(int i=0;i<n;i++)
        {if(b[i]==0 && dfs(i,nums,nums[i]>0))
         return true;}
        return false;
    }
    public boolean dfs(int i,int nums[],boolean f)
    {
        if(b[i]==-1)
            return true;
        if(b[i]==1)
            return false;
        if((nums[i]>=0)!=f)
            return false;
        int next=Math.floorMod(nums[i] + i, nums.length);
        if(i==next)
            return false;
        b[i]=-1;
        boolean val=dfs(next,nums,f);
        b[i]=1;
        return val;
    }
}

 