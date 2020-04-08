static boolean isCyclic(ArrayList<ArrayList<Integer>> list, int V)
    {
        int indeg[]=new int[V];
        for(int i=0;i<V;i++)
        {for(Integer in:list.get(i))
        indeg[in]++;
        }
        int count=0;
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<V;i++)
        {if(indeg[i]==0)
        q.add(i);
        }
        while(!q.isEmpty())
        {int n=q.poll();
        for(Integer i:list.get(n))
        {if(--indeg[i]==0)
        q.add(i);
        }
        count++;
        }
       return count!=V;
    }