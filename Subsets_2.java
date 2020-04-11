class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>>al=new ArrayList<>();
        HashSet<String>hs=new HashSet<>();
        for(int i=0;i<(int)Math.pow(2,n);i++)
        {String check="";
        List<Integer>l=new ArrayList<>();
        for(int j=0;j<n;j++)
        {if(((1<<j)&i)>>j==1)
        {l.add(nums[j]);
        check+=String.valueOf(nums[j])+"$";}}
        if(hs.contains(check))
        {}
        else
        {al.add(l);
        hs.add(check);}}
    return al;
    }
}