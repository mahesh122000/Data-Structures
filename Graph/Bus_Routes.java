class Solution {
    public int numBusesToDestination(int[][] a, int s, int t) {
        if(s==t)
            return 0;
        HashMap<Integer,List<Integer>>hm=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            int r[]=a[i];
            for(int j=0;j<r.length;j++)
            {
                if(!hm.containsKey(r[j]))
                    hm.put(r[j],new ArrayList<>());
                hm.get(r[j]).add(i);
            }
        }
        Queue<Integer>q=new LinkedList<>();
        HashSet<Integer>hs=new HashSet<>();
        q.add(s);
        int count=1;
        while(!q.isEmpty())
        {
            int size=q.size();
            while(size-->0)
            {
                int u=q.poll();
                List<Integer>l=hm.get(u);
                for(Integer v:l)
                {
                    if(!hs.add(v)) continue;
                    for(int r: a[v])
                    {
                            if(r == t) return count;
                            q.offer(r);
                    }
                }
            }
            count++;
        }
        return -1;
    }
}