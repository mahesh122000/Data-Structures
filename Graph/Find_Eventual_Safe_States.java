class Solution {
    static boolean vis[];
    static boolean cycle[];
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        vis=new boolean[n];
        cycle=new boolean[n];
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(terminate(i,graph))
            {
                l.add(i);
            }
        }
        return l;
    }
    boolean terminate(int v,int a[][])
    {
        vis[v]=cycle[v]=true;
        for(Integer u:a[v])
        {
            if(vis[u]==false)
            {
                if(terminate(u,a)==false)
                    return false;
            }
            else if(cycle[u])
            {
                return false;
            }
        }
        cycle[v]=false;
        return true;
    }
}