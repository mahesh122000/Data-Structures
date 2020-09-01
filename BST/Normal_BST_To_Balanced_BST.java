static ArrayList<Integer>al;
    Node buildBalancedTree(Node root) 
    {
        al=new ArrayList<>();
        traverse(root);
        root=build(0,al.size()-1);
        return root;
    }
    Node build(int i,int j)
    {
        if(i>j)
        return null;
        if(i==j)
        return new Node(al.get(i));
        int k=(i+j)/2;
        Node n=new Node(al.get(k));
        n.left=build(i,k-1);
        n.right=build(k+1,j);
        return n;
    }
    void traverse(Node root)
    {
        if(root==null)
        return;
        traverse(root.left);
        al.add(root.data);
        traverse(root.right);
    }