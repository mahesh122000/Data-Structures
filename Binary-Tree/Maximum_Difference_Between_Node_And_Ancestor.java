class Solution {
    int ans;
    public int maxAncestorDiff(TreeNode root) {
        ans=0;
        find(root);
        return ans;
    }
    int[] find(TreeNode root)
    {
        if(root==null)
            return new int[]{-1,-1};
        if(root.left==null && root.right==null)
            return new int[]{root.val,root.val};
        int x[]=find(root.left);
        int y[]=find(root.right);
        if(x[0]==-1)
        {
            x[0]=x[1]=root.val;
        }
        if(y[0]==-1)
        {
            y[0]=y[1]=root.val;
        }
        int min=Math.min(x[0],y[0]);
        int max=Math.max(x[1],y[1]);
        ans=Math.max(ans,Math.max(Math.abs(root.val-min),Math.abs(root.val-max)));
        x[0]=Math.min(min,root.val);
        x[1]=Math.max(max,root.val);
        return x;
    }
}