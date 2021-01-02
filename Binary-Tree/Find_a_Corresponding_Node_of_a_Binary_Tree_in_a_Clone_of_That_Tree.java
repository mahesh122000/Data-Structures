class Solution {
    TreeNode ans;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        ans=null;
        find(original,cloned,target);
        return ans;
    }
    void find(TreeNode a,TreeNode b,TreeNode c)
    {
        if(a==null)
            return;
        if(a==c)
        {
            ans=b;
            return;
        }
        find(a.left,b.left,c);
        find(a.right,b.right,c);
    }
}