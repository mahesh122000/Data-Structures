class DetectCycle
{
    static boolean isCyclic(ArrayList<ArrayList<Integer>> list, int V)
    {
        if(V==0)
        {
            return false;
        }
        boolean visited[]=new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
                if(dfs(list,i,-1,visited))
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    static boolean dfs(ArrayList<ArrayList<Integer>> list,int at,int parent,boolean visited[])
    {
        visited[at]=true;
        ArrayList<Integer> ls=list.get(at);
        for(Integer i: ls)
        {
            if(visited[i]==false)
            {
                if(dfs(list,i,at,visited))
                {
                    return true;
                }
            }
            else if(i!=parent)
            {
                return true;
            }
        }
        return false;
    }
}