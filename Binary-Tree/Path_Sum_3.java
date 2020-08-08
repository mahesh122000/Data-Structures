class Solution {
    static int count;
    public int pathSum(TreeNode root, int sum) {
        count=0;
        if(root==null)
            return 0;
        inorder(root,sum);
        return count;
    }
    void inorder(TreeNode root,int sum)
    {
        if(root==null)
            return ;
        inorder(root.left,sum);
        find(root,sum,0);
        inorder(root.right,sum);
    }
    void find(TreeNode root,int sum,int val)
    {
        if(root==null)
            return ;
        val+=root.val;
        if(val==sum)
            count++;
        find(root.left,sum,val);
        find(root.right,sum,val);
    }
}