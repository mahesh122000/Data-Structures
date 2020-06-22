class Solution {
    HashMap<String,Integer>hm1;
    HashMap<String,Integer>hm2;
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer>al=new ArrayList<>();
        hm1=new HashMap<>();
        int n=words.length;
        if(n==0)
            return al;
        for(int i=0;i<n;i++)
        {
            String c=words[i];
            if(hm1.containsKey(c))
                hm1.put(c,hm1.get(c)+1);
            else
                hm1.put(c,1);
        }
        int m=words[0].length();
        int l=n*m;
        for(int i=0;i<=s.length()-l;i++)
        {
            int start=i;
            if(find(s,start,m,n))
            {
                al.add(i);
            }
        }
        return al;
    }
    public boolean find(String s,int start,int m,int n)
    {
        hm2=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int head = start + i*m;
            int tail = head + m;
            String c=s.substring(head,tail);
            if(hm1.containsKey(c))
            {
                if(hm2.containsKey(c))
                hm2.put(c,hm2.get(c)+1);
            else
                hm2.put(c,1);
            }
            else
                return false;
        }
        return compare();
    }
    public boolean compare()
    {
        for(String c:hm1.keySet())
        {
            if(!hm2.containsKey(c)||hm2.get(c)!=hm1.get(c))
                return false;
        }
        return true;
    }
}