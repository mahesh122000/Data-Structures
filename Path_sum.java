    public boolean hasPathSum(TreeNode root, int sum) {
        return find(root,sum,0);
    }
    public boolean find(TreeNode root,int sum,int data)
    {if(root==null)
        return false;
     if(root.left==null && root.right==null && sum==data+root.val)
     return true;
    if(root.left==null && root.right==null && sum!=data+root.val)
     return false;
    return find(root.left,sum,data+root.val)||find(root.right,sum,data+root.val);