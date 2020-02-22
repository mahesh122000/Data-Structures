int find(Node root)
    {if(root==null)
    return 0;
    return Math.max(find(root.left),find(root.right))+1;
    }
    int diameter(Node root)
    {
     if(root==null)
     return 0;
     int p=find(root.left);
     int q=find(root.right);
     return Math.max(p+q+1,Math.max(diameter(root.left),diameter(root.right)));
    }