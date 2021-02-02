class Solution {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root==null)
            return root;
        TreeNode l=trimBST(root.left,low,high);
        TreeNode r=trimBST(root.right,low,high);
        if(l!=null && r!=null)
        {
            root.left=l;
            root.right=r;
            return root;
        }
        if(root.val<low||root.val>high)
        {
            if(l!=null)
                return l;
            else
                return r;
        }
        root.left=l;
        root.right=r;
        return root;
    }
}