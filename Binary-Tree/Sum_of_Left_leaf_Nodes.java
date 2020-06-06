static int ans;
    public int leftLeavesSum(Node root) 
    { 
        ans=0;
        left(root.left);
        right(root.right);
        return ans;
    }
    public void left(Node root)
    {if(root==null)
    return ;
    if(root.left==null && root.right==null)
    {ans=ans+root.data;
    return;}
    left(root.left);
    right(root.right);
    }
    public void right(Node root)
    {if(root==null)
    return ;
    if(root.left==null && root.right==null)
    return;
    left(root.left);
    right(root.right);
    }