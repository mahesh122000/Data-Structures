class Solution {
    
    public int countRangeSum(int[] a, int l, int u) {
        int n=a.length;
        if(n==0)
            return 0;
        TreeMap<Long,Integer>tm=new TreeMap<>();
        long sum=0;
        int ans=0;
        tm.put(sum,1);
        for(int i:a)
        {sum+=i;
        Map<Long,Integer>mp=tm.subMap(sum-u,true,sum-l,true);
        for(Integer v:mp.values())
         ans+=v;
        tm.put(sum,tm.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}