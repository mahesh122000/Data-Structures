 int findDist(Node root, int a, int b)
    {
    if(root==null)
    return 0;
    if(find(root.left,a)&&find(root.left,b))
    return findDist(root.left,a,b);
    else if(find(root.right,a)&&find(root.right,b))
    return findDist(root.right,a,b);
    else
    return dist(root,a)+dist(root,b);
    }
    int dist(Node root,int n)
    {if(root==null)
    return 0;
    if(root.data==n)
    return 0;
    return 1+Math.min(dist(root.left,n),dist(root.right,n));
    }
    boolean find(Node root,int n)
    {if(root==null)
    return false;
    if(root.data==n)
    return true;
    return find(root.left,n)||find(root.right,n);
    }