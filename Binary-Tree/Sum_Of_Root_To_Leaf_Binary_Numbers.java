class Solution {
    int ans;
    public int sumRootToLeaf(TreeNode root) {
        String val="";
        ans=0;
        if(root==null)
            return ans;
        find(val,root);
        return ans;
    }
    void find(String s,TreeNode root)
    {
        if(root==null)
            return;
        s+=Integer.toString(root.val);
        if(root.left==null && root.right==null)
        {
            ans+=Integer.parseInt(s,2);
            return;
        }
        String a=s,b=s;
        find(a,root.left);
        find(b,root.right);
    }
}