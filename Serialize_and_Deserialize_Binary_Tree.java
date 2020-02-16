class Tree {
    int i;
    Tree()
    { i=0;}
	public void serialize(Node root, ArrayList<Integer> A) {
	   if(root==null)
	   A.add(-1);
	   else
	   {A.add(root.data);
	   serialize(root.left,A);
	   serialize(root.right,A);}
	}
	
    public Node deSerialize(ArrayList<Integer> al){
    if(i==al.size() || al.get(i)==-1)
    {i++;
    return null;}
    Node root=new Node(al.get(i));
    i++;
    root.left=deSerialize(al);
    root.right=deSerialize(al);
    return root;
}
}