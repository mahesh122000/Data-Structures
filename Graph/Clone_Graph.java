 HashMap<Node,Node>hm;
    ArrayList<Node>al;
    public Node cloneGraph(Node node) {
        if(node ==null)
            return null;
        hm=new HashMap<>();
        al=new ArrayList<>();
        find(node);
        for(Node n:al)
        {Node r=hm.get(n);
        ArrayList<Node>l=new ArrayList<>();
        for(Node m:n.neighbors)
         l.add(hm.get(m));
        r.neighbors=l;}
        return hm.get(node);
    }
    void find(Node node)
    {
        if(hm.containsKey(node))
            return ;
        Node root=new Node(node.val);
        hm.put(node,root);
        al.add(node);
        for(Node n:node.neighbors)
        find(n);
    }