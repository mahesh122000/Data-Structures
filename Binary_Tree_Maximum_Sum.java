public int maxPathSum(TreeNode root) {
        if(root==null)
            return Integer.MIN_VALUE;
        int l=find(root.left);
        int r=find(root.right);
        if(l<=0)
            l=0;
        if(r<=0)
            r=0;
        return Math.max(l+r+root.val,Math.max(maxPathSum(root.left),maxPathSum(root.right)));
    }
    public int find(TreeNode root)
    {
        if(root==null)
            return Integer.MIN_VALUE;
        int k=Math.max(find(root.left),find(root.right));
        if(k<0)
            k=0;
        return k+root.val;
    }