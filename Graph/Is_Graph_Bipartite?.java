class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int b[]=new int[n];
        Arrays.fill(b,-1);
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            if(b[i]==-1)
            {
                b[i]=0;
                q.add(i);
                while(!q.isEmpty())
                {
                    int u=q.poll();
                    for(int v:graph[u])
                    {
                        if(b[v]==-1)
                        {
                            b[v]=(b[u]==0)?1:0;
                            q.add(v);
                        }
                        else
                        {
                            if(b[u]==b[v])
                                return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}