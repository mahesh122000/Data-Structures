class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if(find(root))
            return null;
        return root;
    }
    boolean find(TreeNode root)
    {
        if(root==null)
            return true;
        boolean f1=find(root.left);
        boolean f2=find(root.right);
        if(f1)
            root.left=null;
        if(f2)
            root.right=null;
        if(f1 && f2 && root.val==0)
            return true;
        return false;
    }
}