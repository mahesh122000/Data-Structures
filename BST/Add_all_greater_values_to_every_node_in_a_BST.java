 static int val;
    
    public Node modify(Node root)
    {
        val=0;
        find(root);
        return root;
    }
    public void find(Node root)
    {    if(root==null)
        return ;
        find(root.right);
        val+=root.data;
        root.data=val;
        find(root.left);
    }  