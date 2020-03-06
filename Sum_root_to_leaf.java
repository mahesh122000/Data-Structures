class Solution {
    int ans;
    public int sumNumbers(TreeNode root) {
        ans=0;
        return find(root,0,ans);
    }
    public int find(TreeNode root,int cur,int ans)
    {
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
        {cur+=root.val;
         return cur;}
        cur+=root.val;
        cur*=10;
        return find(root.left,cur,ans)+find(root.right,cur,ans);
    }
}