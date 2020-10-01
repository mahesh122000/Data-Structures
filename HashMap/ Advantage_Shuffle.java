class Solution {
    public int[] advantageCount(int[] A, int[] B) {
        TreeMap<Integer,Integer>tm=new TreeMap<>();
        for(int i:A)
        {
            tm.put(i,tm.getOrDefault(i,0)+1);
        }
        Map.Entry<Integer,Integer>map;
        for(int i=0;i<A.length;i++)
        {
            map=tm.higherEntry(B[i]);
            int key=map==null?tm.firstKey():map.getKey();
            A[i]=key;
            int val=tm.get(key);
            if(val==1)
                tm.remove(key);
            else
                tm.put(key,val-1);
        }
        return A;
    }
}

