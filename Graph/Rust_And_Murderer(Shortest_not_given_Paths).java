static HashMap<Integer,HashSet<Integer>>hm;
    static int[] rustMurdered(int s, int[][] roads,int n) {
        hm=new HashMap<>();
        for(int i=0;i<roads.length;i++)
        {
            int x=roads[i][0];
            int y=roads[i][1];
            if(!hm.containsKey(x))
            {
                HashSet<Integer>hs=new HashSet<>();
                hs.add(y);
                hm.put(x,hs);
            }
            else
            {
                hm.get(x).add(y);
            }
            if(!hm.containsKey(y))
            {
                HashSet<Integer>hs=new HashSet<>();
                hs.add(x);
                hm.put(y,hs);
            }
            else
            {
                hm.get(y).add(x);
            }
        }
        HashSet<Integer>not_vis=new HashSet<>();
        Queue<Integer>q=new LinkedList<>();
        q.add(s);
        int ans[]=new int[n];
        ans[s-1]=0;
        for(int i=1;i<=n;i++)
        {
            if(i!=s)
            not_vis.add(i);
        }
        while(not_vis.size()!=0)
        {
            int x=q.poll();
            Iterator<Integer>it=not_vis.iterator();
            HashSet<Integer>vis=new HashSet<>();
            if(!hm.containsKey(x))
            {
                while(it.hasNext())
                {
                    int k=it.next();
                    ans[k-1]=ans[x-1]+1;
                }
                break;
            }
            while(it.hasNext())
            {
                int k=it.next();
                if(!hm.get(x).contains(k) && ans[k-1]==0)
                {
                    ans[k-1]=ans[x-1]+1;
                    q.add(k);
                    vis.add(k);
                }
            }
            Iterator<Integer>itt=vis.iterator();
            while(itt.hasNext())
            {
                int k=itt.next();
                not_vis.remove(k);
            }
        }
        return ans;
    }