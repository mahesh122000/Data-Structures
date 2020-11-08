class Solution {
    int sum;
    public int findTilt(TreeNode root) {
        if(root==null)
            return 0;
        sum=0;
        fill(root);
        find(root);
        return sum;
    }
    int fill(TreeNode root)
    {   
        if(root==null)
            return 0;
        int l=fill(root.left);
        int r=fill(root.right);
        int c=root.val;
        root.val=Math.abs(l-r);
        return l+r+c;
    }
    void find(TreeNode root)
    {
        if(root==null)
            return;
        sum+=root.val;
        find(root.left);
        find(root.right);
    }
}