class Solution {
    static int sum;
    public int deepestLeavesSum(TreeNode root) {
        int h=find(root);
        sum=0;
        calc(root,1,h);
        return sum;
    }
    public int find(TreeNode root)
    {
        if(root==null)
            return 0;
        return 1+Math.max(find(root.left),find(root.right));
    }
    public void calc(TreeNode root,int i,int h)
    {
        if(root==null)
            return ;
        if(i==h)
            sum+=root.val;
        calc(root.left,i+1,h);
        calc(root.right,i+1,h);
    }
}