class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       int n=nums.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);}
        HashMap<Integer,List<Integer>>reverse=new HashMap<>();
        for(HashMap.Entry<Integer,Integer>entry:hm.entrySet())
        {List<Integer>l=reverse.get(entry.getValue());
        if(l==null)
         l=new ArrayList<>();
        l.add(entry.getKey());
        reverse.put(entry.getValue(),l);
        }
        int ans[]=new int[k];
        for(int i=n,j=0;i>0 && j<k;i--)
        {if(reverse.containsKey(i))
        {for(Integer p:reverse.get(i))
        {ans[j]=p;
        j++;}}}
        return ans;
        
    }
}

