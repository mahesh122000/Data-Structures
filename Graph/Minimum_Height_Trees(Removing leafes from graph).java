class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<HashSet<Integer>>al=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        if(n==0)
            return ans;
        else if(n==1)
        {
            ans.add(0);
            return ans;
        }
        for(int i=0;i<n;i++)
        {
            al.add(new HashSet<>());
        }
        for(int a[]:edges)
        {
            al.get(a[0]).add(a[1]);
            al.get(a[1]).add(a[0]);
        }
        for(int i=0;i<n;i++)
        {
            if(al.get(i).size()==1)
                ans.add(i);
        }
        while(n>2)
        {
            n=n-ans.size();
            List<Integer>new_leaves=new ArrayList<>();
            for(Integer i:ans)
            {
            int next=al.get(i).iterator().next();
            al.get(next).remove(i);
            if(al.get(next).size()==1)
                new_leaves.add(next);
            }
            ans=new_leaves;
        }
        return ans;
    }
}


