 void mirror(Node root)
    {if(root==null ||(root.left==null && root.right==null))
    return ;
    mirror(root.left);
    mirror(root.right);
    Node temp=root.left;
    root.left=root.right;
    root.right=temp;
    }
    boolean check(Node root,Node node)
    {if(root==null && node==null)
    return true;;
    if(root==null || node==null)
    return false;
    return check(root.left,node.left)&&check(root.right,node.right);
    }
    boolean IsFoldable(Node root) 
	{ 
		if(root==null)
		return true;
		mirror(root.left);
		boolean flag= check(root.left,root.right);
		mirror(root.left);
		return flag;
	} 