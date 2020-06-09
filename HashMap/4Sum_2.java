class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<C.length;i++)
        {for(int j=0;j<D.length;j++)
        {int k=C[i]+D[j];
        if(hm.containsKey(k))
         hm.put(k,hm.get(k)+1);
        else
         hm.put(k,1);}}
        int ans=0;
        for(int i=0;i<A.length;i++)
        {for(int j=0;j<B.length;j++)
        {int k=A[i]+B[j];
        if(hm.containsKey(-k))
         ans+=hm.get(-k);}}
        return ans;
    }
}