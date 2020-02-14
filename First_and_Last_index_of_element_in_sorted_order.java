class Solution {
    public int[] searchRange(int[] nums, int target) {
        HashMap<Integer,int[] >hm=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {if(hm.containsKey(nums[i]))
        {int x[]=hm.get(nums[i]);
        x[1]=i;}
        else
        {hm.put(nums[i],new int []{i,i});}}
        int ans[]=new int[2];
        if(hm.containsKey(target))
        {int x[]=hm.get(target);
        return x;
        }
        else
        {ans[0]=-1;
        ans[1]=-1;
        return ans;}
    }
}