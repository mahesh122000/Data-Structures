int findmax(Node root,int j)
    {if(root==null)
    return j;
    j++;
    return Math.max(findmax(root.left,j),findmax(root.right,j));
    }
    boolean isBalanced(Node root)
    {if(root==null)
    return true;
	if(Math.abs(findmax(root.left,0)-findmax(root.right,0))<=1)
	return isBalanced(root.left)&&isBalanced(root.right);
	return false;
    }