class Solution {
    public int numRabbits(int[] a) {
        int n=a.length;
        HashSet<Integer>hs=new HashSet<>();
        HashMap<Integer,Double>hm=new HashMap<>();
        for(Integer i:a)
        {
            hs.add(i);
            hm.put(i,hm.getOrDefault(i,0.0)+1.0);
        }
        int ans=0;
        Iterator<Integer>it=hs.iterator();
        while(it.hasNext())
        {
            int k=it.next();
            System.out.println(Math.ceil(hm.get(k)/(k+1)));
            ans+=(int)(Math.ceil(hm.get(k)/(k+1))*(k+1));
        }
        return ans;
    }
}