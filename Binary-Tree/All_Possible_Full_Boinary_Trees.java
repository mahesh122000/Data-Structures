class Solution {
    HashMap<Integer,List<TreeNode>>hm;
    public List<TreeNode> allPossibleFBT(int N) {
        hm=new HashMap<>();
        List<TreeNode>l=new ArrayList<>();
        l.add(new TreeNode(0));
        hm.put(1,l);
        return find(N);
    }
    List<TreeNode> find(int n)
    {
        List<TreeNode>ans=new ArrayList<>();
        if(hm.containsKey(n))
            return hm.get(n);
        for(int i=1;i<n;i+=2)
        {
            List<TreeNode>l=find(i);
            List<TreeNode>r=find(n-i-1);
            for(TreeNode lt:l)
            {
                for(TreeNode rt:r)
                {
                    TreeNode tn=new TreeNode(0);
                    tn.left=lt;
                    tn.right=rt;
                    ans.add(tn);
                }
            }
        }
        hm.put(n,ans);
        return ans;
    }
}