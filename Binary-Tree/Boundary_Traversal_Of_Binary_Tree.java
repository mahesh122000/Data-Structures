class Solution
{
    ArrayList<Integer>al;
    void left(Node root)
    {
        if(root==null)
        return;
        if(root.left!=null)
        {
            al.add(root.data);
            left(root.left);
        }
        else if(root.right!=null)
        {
            al.add(root.data);
            left(root.right);
        }
    }
    void leaf(Node root)
    {
        if(root==null)
        return;
        leaf(root.left);
        if(root.left==null && root.right==null)
        {
            al.add(root.data);
            return;
        }
        leaf(root.right);
    }
    void right(Node root)
    {
        if(root==null)
        return;
         if(root.right!=null)
        {
            right(root.right);
            al.add(root.data);
        }
        else if(root.left!=null)
        {
            right(root.left);
            al.add(root.data);
        }
    }
	ArrayList <Integer> printBoundary(Node node)
	{
	    al=new ArrayList<>();
	    if(node==null)
	    return al;
	    al.add(node.data);
	    left(node.left);
	    leaf(node);
	    right(node.right);
	    return al;
	}
}