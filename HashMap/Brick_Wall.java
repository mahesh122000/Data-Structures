class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        HashSet<Integer>hs=new HashSet<>();
        int n=wall.size();
        for(List<Integer>l:wall)
        {
            int sum=0;
            for(Integer i:l)
            {
                sum+=i;
                hm.put(sum,hm.getOrDefault(sum,0)+1);
                hs.add(sum);
            }
            hs.remove(sum);
            hm.remove(sum);
        }
        Iterator<Integer>it=hs.iterator();
        int ans=n;
        while(it.hasNext())
        {
            int k=it.next();
            ans=Math.min(ans,n-hm.get(k));
        }
        return ans;
    }
}