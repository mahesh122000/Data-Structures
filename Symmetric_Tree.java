public static boolean check(Node root,Node node)
    {if(root==null && node==null)
    return true;
    else if(root==null || node==null)
    return false;
    if(root.data==node.data)
    return check(root.left,node.right)&&check(root.right,node.left);
    else
    return false;
    }
    public static boolean isSymmetric(Node root)
    {
        return check(root.left,root.right);
        
    }