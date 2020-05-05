 List<List<Integer>>al;
    public List<List<Integer>> combine(int n, int k) {
    al=new ArrayList<>();
    List<Integer>l=new ArrayList<>();
    for(int i=1;i<=n;i++)
    {l.add(i);
     find(l,i,1,k,n);
    l.remove(l.size()-1);
    }
        if(k==0)
            al.add(l);
        return al;
    }
    public void find(List<Integer>l,int n,int i,int k,int m)
    {
        if(i==k)
        {
            List<Integer>ll=new ArrayList<Integer>();
            ll.addAll(l);
            al.add(ll);
            return ;
        }
        for(int j=n+1;j<=m;j++)
        {l.add(j);
        find(l,j,i+1,k,m);
        l.remove(l.size()-1);}
    }