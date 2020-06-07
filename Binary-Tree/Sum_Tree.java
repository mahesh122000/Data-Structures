class Tree
{
    static boolean ans;
	boolean isSumTree(Node node)
	{
             ans=true;
             find(node);
             return ans;
	}
	int find(Node node)
	{
	    if(node==null)
             return 0;
             if(node.left!=null && node.right!=null)
             {int l=find(node.left);
             int r=find(node.right);
             if(l+r==node.data)
             return l+r+node.data;
             else
             {ans=ans&false;
             return 0;}
             }
             if(node.left==null && node.right==null)
             return node.data;
             else if(node.left==null)
             {int r=find(node.right);
             if(r==node.data)
             return r+node.data;
             else
             {ans=ans&false;
             return 0;}
             }
             else if(node.right==null)
             {int l=find(node.left);
             if(l==node.data)
             return l+node.data;
             else
             {ans=ans&false;
             return 0;}
             }
             return 0;
	}
}