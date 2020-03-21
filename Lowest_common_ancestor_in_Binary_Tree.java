Node lca(Node root, int n1,int n2)
	{
	    Node left,right;
	    if(root==null)
	    return null;
	    if(root.data==n1 || root.data==n2)
	    return root;
	    left=lca(root.left,n1,n2);
	    right=lca(root.right,n1,n2);
	    if(left!=null && right!=null)
	    return root;
	    else if(left==null)
	    return right;
	    else
	    return left;
	}