class FindElements {
    TreeNode node;
    HashSet<Integer>hs;
    public FindElements(TreeNode root) {
        hs=new HashSet<>();
        if(root!=null)
            root.val=0;
        node=convert(root,0);
    }
    TreeNode convert(TreeNode root,int v)
    {
        if(root==null)
            return null;
        root.val=v;
        hs.add(v);
        root.left=convert(root.left,2*v+1);
        root.right=convert(root.right,2*v+2);
        return root;
    }
    public boolean find(int target) {
        return hs.contains(target);
    }
}

