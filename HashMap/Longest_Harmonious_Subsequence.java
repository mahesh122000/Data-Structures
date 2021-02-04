class Solution {
    public int findLHS(int[] a) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int n=a.length;
        for(int i:a)
            hm.put(i,hm.getOrDefault(i,0)+1);
        int max=0;
        for(int i:a)
        {
            int p=hm.get(i);
            int q=0;
            if(hm.containsKey(i+1))
            {
                max=Math.max(max,p+hm.get(i+1));
            }
            if(hm.containsKey(i-1))
            {
                max=Math.max(max,p+hm.get(i-1));
            }
        }
        return max;
    }
}