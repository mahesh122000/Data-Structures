static ArrayList<Node>al;
    Node bToDLL(Node root)
    {
        al=new ArrayList<>();
       find(root);
       Node head=build();
       return head;
    }
    void find(Node root)
    {
        if(root==null)
        return ;
        find(root.left);
        al.add(root);
        find(root.right);
    }
    Node build()
    {
        if(al.size()==0)
        return null;
        Node head=al.get(0);
        Node n=head;
        for(int i=1;i<al.size();i++)
        {n.right=al.get(i);
        al.get(i).left=n;
        n=n.right;}
        return head;
    }