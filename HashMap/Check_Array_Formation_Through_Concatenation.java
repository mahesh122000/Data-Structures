class Solution {
    public boolean canFormArray(int[] a, int[][] p) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<p.length;i++)
        {
            hm.put(p[i][0],i);
        }
        for(int i=0;i<a.length;)
        {
            if(hm.containsKey(a[i]))
            {
                int ind=hm.get(a[i]);
                int q[]=p[ind];
                int j=0;
                for(;j<q.length && i<a.length;)
                {
                    if(a[i]!=q[j])
                        return false;
                    i++;
                    j++;
                }
                if(j!=q.length)
                    return false;
            }
            else
                return false;
        }
        return true;
    }
}