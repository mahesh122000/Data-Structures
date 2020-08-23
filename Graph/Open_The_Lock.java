class Solution {
    public int openLock(String[] deadends, String target) {
        Queue<String>q=new LinkedList<>();
        HashSet<String>hs1=new HashSet<>();
        HashSet<String>hs2=new HashSet<>();
        for(String c:deadends)
            hs1.add(c);
        if(hs1.contains("0000"))
            return -1;
        q.add("0000");
        hs2.add("0000");
        int l=0;
        if(target.equals("0000"))
            return 0;
        while(!q.isEmpty())
        {
            int si=q.size();
            while(si-->0)
            {
                String s=q.poll();
                for(String c:find(s))
                {
                    if(c.equals(target))
                        return l+1;
                    if(!hs1.contains(c) && !hs2.contains(c))
                    {
                        q.add(c);
                        hs2.add(c);
                    }
                }
            }
            l++;
        }
        return -1;
    }
    List<String> find(String s)
    {
        List<String>l=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            int k=s.charAt(i)-'0';
            int p=(k+1)%10;
            int q=(k-1+10)%10;
            l.add(s.substring(0,i)+p+s.substring(i+1));
            l.add(s.substring(0,i)+q+s.substring(i+1));
        }
        return l;
    }
}