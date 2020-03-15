 public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        int n=nums.length;
        if(n==0)
            return 0;
        int count=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {sum+=nums[i];
        if(hm.containsKey(sum-k))
         count+=hm.get(sum-k);
        if(hm.containsKey(sum))
        {int p=hm.get(sum);
        p++;
        hm.put(sum,p);}
        else
        {hm.put(sum,1);}}
        return count;
    }