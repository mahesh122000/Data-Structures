TreeNode node=null;
    public void flatten(TreeNode root) {
       if(root==null)
           return;
        if(node==null)
            node=root;
        else
        {node.right=root;
        node=root;}
        TreeNode l=root.left;
        TreeNode r=root.right;
        root.left=null;
        flatten(l);
        flatten(r);
    }