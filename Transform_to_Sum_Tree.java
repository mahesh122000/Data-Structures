 public void toSumTree(Node root){
        int k=find(root);
    }
    public int find(Node root)
    {if(root==null)
    {return 0;}
    int val=root.data;
    if(root.left==null && root.right==null)
    root.data=0;
    else
    root.data=find(root.left)+find(root.right);
    return val+root.data;
    }