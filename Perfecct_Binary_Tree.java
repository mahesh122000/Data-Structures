class GfG
{
    
    public static boolean isPerfectRec(Node root, int d, int level)
    {
    if(root==null)
    return true;
    if(root.left==null && root.right==null && level==d-1)
    return true;
    if((root.left==null)||(root.right==null))
    return false;
    return isPerfectRec(root.left,d,level+1)&isPerfectRec(root.right,d,level+1);
    }
}