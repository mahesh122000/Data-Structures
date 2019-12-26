public static int getCountOfNode(Node root,int l, int h)
{
    if(root==null)
    return 0;
    if(root.left==null && root.right==null)
    {if(root.data>=l && root.data<=h)
    return 1;
    else
    return 0;}
    if(root.data>=l && root.data<=h)
    return 1+getCountOfNode(root.left,l,h)+getCountOfNode(root.right,l,h);
    else
    return getCountOfNode(root.left,l,h)+getCountOfNode(root.right,l,h);
}