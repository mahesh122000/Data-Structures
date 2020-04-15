public static Node deleteNode(Node root, int value)
	{
		if(root==null)
		return null;
		else if(root.data>value)
		root.left=deleteNode(root.left,value);
		else if(root.data<value)
		root.right=deleteNode(root.right,value);
		else
		{
		    if(root.right==null)
		    {root=root.left;}
		    else if(root.left==null)
		    {root=root.right;}
		    else
		    {Node child=root.left;
		    while(child.right!=null)
		    {
		    child=child.right;
		    }
		    root.data=child.data;
		    root.left=deleteNode(root.left,root.data);
		    }
		}
		    return root;
	}