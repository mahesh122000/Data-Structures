	public Node prune(Node root, int sum) { 
	    INT a=new INT(0);
	    return find(root,sum,a);
	    }
	    public Node find(Node root,int sum,INT k)
	    {
	        if(root==null)
	        return null;
	        INT l=new INT(k.v+root.data);
	        INT r=new INT(l.v);
	        root.left=find(root.left,sum,l);
	        root.right=find(root.right,sum,r);
	        k.v=Math.max(l.v,r.v);
	        if(k.v>=sum)
	        {}
	        else
	        root=null;
	        return root;
	}