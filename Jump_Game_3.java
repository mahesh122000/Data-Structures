 public boolean canReach(int[] arr, int start) {
        int n=arr.length;
        if(n==0)
            return false;
        int a[]=new int[n];
        return bfs(arr,a,start);
    }
    public boolean bfs(int a[],int b[],int i)
    {
        Queue<Integer>q=new LinkedList<>();
        q.add(i);
        while(!q.isEmpty())
        {
            int j=q.poll();
            if(a[j]==0)
                return true;
            b[j]=1;
            int k=j-a[j];
            if(k>=0 && b[k]!=1)
             q.add(k);
            k=j+a[j];
            if(k<a.length && b[k]!=1)
                q.add(k);
           }
    return false;
    }