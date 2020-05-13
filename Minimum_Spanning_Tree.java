class MST
{
    static int spanningTree(int V, int E, ArrayList<ArrayList<Integer>> graph)
    {
        int max=Integer.MAX_VALUE;
        ArrayList<Integer> wt = new ArrayList<Integer>(V);
        for(int i=0;i<V;i++){
            wt.add(new Integer(max));
        }
        ArrayList<Boolean> visited = new ArrayList<Boolean>(V);
        for(int i=0;i<V;i++)
         visited.add(false);
        wt.set(0,0);
        for(int i=0;i<V-1;i++){
            int minVertex=getMin(wt,visited);
            visited.set(minVertex,true);
            for(int j=0;j<V;j++){
                if((!visited.get(j))&&graph.get(minVertex).get(j)!=max){
                    if(graph.get(minVertex).get(j)<wt.get(j)){
                        wt.set(j,graph.get(minVertex).get(j));
                    }
                }
            }
        }
        int sum=0;
      for(int i=0;i<V;i++){
          sum+=wt.get(i);
      }
     
       return sum;
    }
    static int getMin(ArrayList<Integer> wt,ArrayList<Boolean> vis){
        int Min=-1;
        for(int i=0;i<wt.size();i++){
            if((!vis.get(i))&&(Min == -1 || wt.get(i)<wt.get(Min)))
             Min=i;
            }
        return Min;
    }
}