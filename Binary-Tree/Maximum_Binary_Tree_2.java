class Solution {
    int a[];
    int i;
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        i=0;
        a=new int[101];
        fill(root);
        a[i]=val;
        return construct(0,i);
    }
    void fill(TreeNode root)
    {
        if(root==null)
            return;
        fill(root.left);
        a[i++]=root.val;
        fill(root.right);
    }
    TreeNode construct(int low,int high)
    {
        if(low>high)
            return null;
        if(low==high)
            return new TreeNode(a[low]);
        int k=find(low,high);
        TreeNode n=new TreeNode(a[k]);
        n.left=construct(low,k-1);
        n.right=construct(k+1,high);
        return n;
    }
    int find(int i,int j)
    {
        int index=0,max=0;
        for(int k=i;k<=j;k++)
        {
            if(max<a[k])
            {
                max=a[k];
                index=k;
            }
        }
        return index;
    }
}