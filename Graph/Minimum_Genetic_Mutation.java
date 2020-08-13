class Solution {
    public int minMutation(String start, String end, String[] bank) {
        int n=bank.length;
        if(n==0)
            return -1;
        HashSet<String>hs=new HashSet<>();
        for(int i=0;i<n;i++)
            hs.add(bank[i]);
        if(!hs.contains(end))
            return -1;
        Queue<String>q=new LinkedList<>();
        int l=0;
        char arr[]={'A','C','G','T'};
        q.add(start);
        while(!q.isEmpty())
        {
            int si=q.size();
            while(si-->0)
            {
                String s=q.poll();
                char c[]=s.toCharArray();
                for(int i=0;i<c.length;i++)
                {
                    for(int j=0;j<4;j++)
                    {
                        if(arr[j]!=c[i])
                        {
                            char updt=c[i];
                            c[i]=arr[j];
                            String str=new String(c);
                            if(str.equals(end))
                                return l+1;
                            if(hs.contains(str))
                            {
                                q.add(str);
                                hs.remove(str);
                            }
                            c[i]=updt;
                        }
                    }
                }
            }
            l++;
        }
        return -1;
    }
}