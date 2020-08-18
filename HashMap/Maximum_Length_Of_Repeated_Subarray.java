class Solution {
    public int findLength(int[] a, int[] b) {
        HashMap<Integer,ArrayList<Integer>>hm=new HashMap<>();
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(a[i]))
            {
                hm.get(a[i]).add(i);
            }
            else
            {
                ArrayList<Integer>al=new ArrayList<>();
                al.add(i);
                hm.put(a[i],al);
            }
        }
        int ans=0;
        int m=b.length;
        for(int i=0;i<m;i++)
        {
            if(hm.containsKey(b[i]) && m-i>ans)
            {
                for(Integer j:hm.get(b[i]))
                {
                    int count=0;
                    int k=i;
                    while(k<m && j<n)
                    {
                        if(a[j]!=b[k])
                            break;
                        j++;
                        k++;
                    }
                    int l=k-i;
                    ans=Math.max(ans,l);
                }
            }
        }
        return ans;
    }
}