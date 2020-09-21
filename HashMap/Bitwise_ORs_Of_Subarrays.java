class Solution {
    public int subarrayBitwiseORs(int[] A) {
        HashSet<Integer>hs1=new HashSet<>();
        HashSet<Integer>hs2=new HashSet<>();
        hs2.add(0);
        for(int i:A)
        {
            HashSet<Integer>hs3=new HashSet<>();
            for(Integer j:hs2)
            {
                hs3.add(i|j);
            }
            hs2=hs3;
            hs2.add(i);
            hs1.addAll(hs2);
        }
        return hs1.size();
    }
}