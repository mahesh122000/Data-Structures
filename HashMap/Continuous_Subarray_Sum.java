class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        int sum=0;
        boolean flag=false;
        hm.put(0,-1);
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            if(k!=0)
            sum%=k;
            if(hm.containsKey(sum))
            {
                int val=(i-hm.get(sum));
                //System.out.println(sum+" "+i+" "+hm.get(sum));
                if(val>=2)
                {
                    flag=true;
                    break;
                }
                else
                {}
            }
            else
            {
                hm.put(sum,i);
            }
        }
        return flag;
    }
}