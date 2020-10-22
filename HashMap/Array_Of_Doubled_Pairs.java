class Solution {
    public boolean canReorderDoubled(int[] a) {
        ArrayList<Integer>al=new ArrayList<>();
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:a)
        {
            if(hm.containsKey(i))
            {
                hm.put(i,hm.get(i)+1);
            }
            else
            {
                al.add(i);
                hm.put(i,1);
            }
        }
        Collections.sort(al);
        for(Integer i:al)
        {
            if(hm.get(i)==0)
                continue;
            int p=hm.get(i);
            if(i<0)
            {
                if(-i%2==1 && p>0)
                    return false;
                int q=hm.getOrDefault(i/2,0);
                if(p>q)
                    return false;
                hm.put(i/2,q-p);
            }
            else
            {
                int q=hm.getOrDefault(i*2,0);
                if(p>q)
                    return false;
                hm.put(i*2,q-p);
            }
        }
        return true;
    }
}