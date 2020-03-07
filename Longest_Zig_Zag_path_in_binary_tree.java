class Solution {
    public int longestZigZag(TreeNode root) {
        int max=0;
        if(root==null)
            return max;
        max=Math.max(find(root.left,0,0),find(root.right,1,0));
        return max;
    }
    public int find(TreeNode root,int i,int k)
    {if(root==null)
     return k;
     if(i==0)
    return Math.max(find(root.right,1,k+1),find(root.left,0,0));
    else
     return Math.max(find(root.left,0,k+1),find(root.right,1,0));}
}