class Solution {
    public int findLUSlength(String[] strs) {
        int n=strs.length;
        if(n==1)
            return strs[0].length();
        HashMap<String,Integer>hm=new HashMap<>();
        HashSet<String>hs=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            hm.put(strs[i],hm.getOrDefault(strs[i],0)+1);
            hs.add(strs[i]);
        }
        int l=hs.size();
        String a[]=new String[l];
        Iterator<String>it=hs.iterator();
        int i=0;
        while(it.hasNext())
        {
            a[i]=it.next();
            i++;
        }
        Arrays.sort(a,(p,q)->p.length()==q.length()?p.compareTo(q):q.length()-p.length());
        for(i=0;i<l;i++)
        {
            if(isSafe(a[i],a,0,i-1) && hm.get(a[i])==1)
            {
                return a[i].length();
            }

        }
        return -1;
    }
    boolean isSafe(String s,String a[],int i,int j)
    {
        for(;i<=j;i++)
        {
            String c=a[i];
            int k=0;
            int r=0;
            while(k<c.length() && r<s.length())
            {
                if(c.charAt(k)==s.charAt(r))
                    r++;
                k++;
            }
            if(r==s.length())
                return false;
        }
        return true;
    }
}