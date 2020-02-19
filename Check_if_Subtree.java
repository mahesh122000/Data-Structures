class Tree {
    public static boolean check(Node a,Node b)
    {if(a==null && b==null)
    return true;
    if((a==null && b!=null )||(a!=null && b==null) || (a.data!= b.data))
    return false;
    return check(a.left,b.left)&&check(a.right,b.right);
    }
    public static boolean isSubtree(Node T, Node S) {
        if(T==null && S!=null)
        return false;
        if(S==null)
        return true;
        if(T.data==S.data)
        return check(T,S) || isSubtree(T.left,S) || isSubtree(T.right,S);
        else
        return isSubtree(T.left,S) || isSubtree(T.right,S);
    }
}