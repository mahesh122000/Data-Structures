class GfG
{
    int minDepth(Node root)
    {
        if(root.left==null && root.right==null)
        return 1;
        if(root.left==null && root.right!=null)
        return 1+minDepth(root.right);
        if(root.left!=null && root.right==null)
        return 1+minDepth(root.left);
       
        return Math.min(1+minDepth(root.left),1+minDepth(root.right));
    }
}