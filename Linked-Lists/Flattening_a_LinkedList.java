Node flatten(Node root)
    {
	if(root==null)
	return null;
	if(root.next==null)
	return root;
	Node t=root;
	root=root.next;
	while(root!=null)
	{
	//System.out.println(root.data+" ");
	Node p=root;
	root=root.next;
	t=sort(t,p);
	//print(t);
    }
    return t;
    }
    Node sort(Node n,Node p)
    {
        if(n==null)
        return p;
        if(p==null)
        return n;
        if(n.data<=p.data)
        {n.bottom=sort(n.bottom,p);
        return n;}
        else
        {p.bottom=sort(n,p.bottom);
        return p;}
    }