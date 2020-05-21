class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long>ts=new TreeSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {long p=(long)nums[i];
        Long l=ts.floor(p);
        if(l!=null && p-l<=t)
         return true;
        Long r=ts.ceiling(p);
        if(r !=null && r-p<=t)
         return true;
        ts.add(p);
        if(ts.size()>k)
         ts.remove((long)nums[i-k]);
        }
        return false;
    }
}

