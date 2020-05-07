static List<List<Integer>>al;
    static HashSet<List<Integer>>hs;
    public List<List<Integer>> permuteUnique(int[] nums) {
       al=new ArrayList<>();
        hs=new HashSet<>();
        int n=nums.length;
        Arrays.sort(nums);
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<n;i++)
            l.add(nums[i]);
        find(0,n-1,l);
        if(al.size()==0)
            al.add(l);
        return al; 
    }
     public void find(int i,int n,List<Integer>l)
    {
        if(i==n)
        {
            List<Integer>ll=new ArrayList<>();
            ll.addAll(l);
            if(!hs.contains(ll))
            {al.add(ll);hs.add(ll);}
            return ;
        }
        for(int j=i;j<=n;j++)
        {
         swap(l,i,j);
         find(i+1,n,l);
         swap(l,i,j);
        }
    }
    public void swap(List<Integer>l,int i,int j)
    {
       int t=l.get(i);
         l.set(i,l.get(j));
         l.set(j,t); 
    }