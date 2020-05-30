class Tree
{
    static int ans;
    int maxDiff(Node root)
    {
        ans=Integer.MIN_VALUE;
        if(root==null)
        return ans;
        int max=root.data;
        find(root.left,max);
        find(root.right,max);
        return ans;
    }
    void find(Node root,int val)
    {
        if(root==null)
        return;
        ans=Math.max(ans,val-root.data);
        val=Math.max(val,root.data);
        find(root.left,val);
        find(root.right,val);
    }
}