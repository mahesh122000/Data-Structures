class Traversal
{
    static void dfs(int src, ArrayList<ArrayList<Integer>> list, boolean vis[])
    {
       vis[src]=true;
       System.out.print(src+" ");
       Iterator it=list.get(src).listIterator();
       while(it.hasNext())
       {int k=(int)it.next();
           if(vis[k]==false)
       dfs(k,list,vis);}
    }
}