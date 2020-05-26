class Solution {
    static int ans;
    public int distributeCoins(TreeNode root) {
        ans=0;
        find(root);
        return ans;
    }
    public int find(TreeNode root)
    {
        if(root==null)
            return 0;
        root.val+=find(root.left);
        root.val+=find(root.right);
        int m=0;
        if(root.val<=0)
            m=-1*(1-root.val);
        else
            m=root.val-1;
        ans+=Math.abs(m);
        return m;
    }
}