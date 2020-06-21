class Solution {
    public int longestSubsequence(int[] a, int d) {
     HashMap<Integer,Integer>hm=new HashMap<>();
     int n=a.length;
     if(n==0)
         return 0;
     hm.put(a[n-1],1);
     int max=1;
     for(int i=n-2;i>=0;i--)
     {
         int v=a[i]+d;
         if(hm.containsKey(v))
         {
             int k=hm.get(v);
             k++;
             hm.put(a[i],k);
             max=Math.max(max,k);
         }
         else
         {
             hm.put(a[i],1);
         }
     }
        return max;
    }
}