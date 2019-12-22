class GfG
{
    public Node removeHalfNodes(Node root)
    {
        if(root==null)
        return null;
        if(root.left==null && root.right==null)
        return root;
        if(root.left==null && root.right!=null)
        return removeHalfNodes(root.right);
        if(root.left!=null && root.right==null)
        return removeHalfNodes(root.left);
        root.left=removeHalfNodes(root.left);
        root.right=removeHalfNodes(root.right);
        return root;
    }
}