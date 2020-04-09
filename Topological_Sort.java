static int[] topoSort(ArrayList<ArrayList<Integer>> list, int N) {
        int indeg[]=new int[N];
        for(int i=0;i<N;i++)
        {for(Integer in:list.get(i))
        indeg[in]++;
        }
        int count=0;
        int a[]=new int[N];
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<N;i++)
        {if(indeg[i]==0)
        q.add(i);
        }
        while(!q.isEmpty())
        {int n=q.poll();
        for(Integer i:list.get(n))
        {if(--indeg[i]==0)
        q.add(i);
        }
        a[count]=n;
        count++;
        }
        return a;
    }