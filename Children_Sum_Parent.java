class Tree
{
    public static int isSumProperty(Node root)
    {
        if(root==null)
        return 1;
        if(root.left==null && root.right==null)
        return 1;
        int k=root.data;
        int a=0,b=0;
        if(root.left!=null)
        a=root.left.data;
        if(root.right!=null)
        b=root.right.data;
        if(k==a+b)
        return isSumProperty(root.left)&isSumProperty(root.right);
        else 
        return 0;
    }
}