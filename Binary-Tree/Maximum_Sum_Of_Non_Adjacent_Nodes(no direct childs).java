class GFG
{
    static int getMaxSum(Node root)
    {
        if(root==null)
        return 0;
        int a=getMaxSum(root.left)+getMaxSum(root.right);
        int b=root.data;
        if(root.left!=null)
        b+=getMaxSum(root.left.left)+getMaxSum(root.left.right);
        if(root.right!=null)
        b+=getMaxSum(root.right.left)+getMaxSum(root.right.right);
        return Math.max(a,b);
    }
}