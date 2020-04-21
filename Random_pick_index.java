class Solution {
 HashMap<Integer,ArrayList<Integer>>hm;
    Random ran;
    public Solution(int[] nums) {
        hm=new HashMap<>();
        ran=new Random();
        for(int i=0;i<nums.length;i++)
        {if(hm.containsKey(nums[i]))
        {ArrayList<Integer>al=hm.get(nums[i]);
        al.add(i);
        hm.put(nums[i],al);}
        else
        {ArrayList<Integer>al=new ArrayList<>();
        al.add(i);
        hm.put(nums[i],al);}}
    }
    
    public int pick(int target) {
        ArrayList<Integer>al=hm.get(target);
        int n=al.size();
        return al.get(ran.nextInt(n));
    }
}

