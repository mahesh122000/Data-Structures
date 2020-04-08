int min(Node root)
    {if(root==null || (root.left==null && root.right==null))
    return 0;
    if(root.left==null && root.right!=null)
    return 1+min(root.right);
    if(root.left!=null && root.right==null)
    return 1+min(root.left);
    return 1+Math.min(min(root.left),min(root.right));
    }
    int findClosest(Node node, int k)  
    { 
        Node r=find(node,k);
        return min(r);
    }
    Node find(Node root,int k)
    {if(root==null)
    return null;
    if(root.data==k)
    return root;
    Node kk=find(root.left,k);
    if(kk==null)
    return find(root.right,k);
    else
    return kk;
    }