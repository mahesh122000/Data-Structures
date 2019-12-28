class GfG
{
	boolean isFullTree(Node root)
    {
        if(root==null)
        return true;
        if(root.left==null && root.right==null)
        return true;
        if((root.left==null && root.right!=null)||(root.left!=null && root.right==null))
        return false;
        return isFullTree(root.left)&isFullTree(root.right);
    }
}