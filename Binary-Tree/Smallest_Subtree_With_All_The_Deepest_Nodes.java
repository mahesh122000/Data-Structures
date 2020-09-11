class Solution {
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if(root==null)
            return root;
        int left=height(root.left);
        int right=height(root.right);
        if(left==right)
            return root;
        if(left>right)
            return subtreeWithAllDeepest(root.left);
        return subtreeWithAllDeepest(root.right);
    }
    int height(TreeNode root)
    {
        if(root==null)
            return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
}