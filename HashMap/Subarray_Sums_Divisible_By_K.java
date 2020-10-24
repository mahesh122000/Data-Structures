class Solution {
    public int subarraysDivByK(int[] a, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        int sum=0;
        int n=a.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
            int p=sum%k;
            if(p<0)
                p+=k;
            if(hm.containsKey(p))
            {
                ans+=hm.get(p);
                hm.put(p,hm.get(p)+1);
            }
            else
            {
                hm.put(p,1);
            }
            //System.out.print(p+" ");
        }
        return ans;
    }
}