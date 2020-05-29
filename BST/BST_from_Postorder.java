static class Index
    {
        int i;
        Index()
        {i=0;}
    }
	static Node constructTree(int post[], int n) { 
	    Index in=new Index();
	    in.i=n-1;
	    int min=Integer.MIN_VALUE;
	    int max=Integer.MAX_VALUE;
	    Node root=create(post,in,min,max);
	    return root;
	} 
	static Node create(int a[],Index in,int min,int max)
	{
	    if(in.i<0)
	    return null;
	    Node root=null;
	    if(a[in.i]>min && a[in.i]<max)
	    {root=new Node(a[in.i]);
	    in.i--;
	    root.right=create(a,in,root.data,max);
	    root.left=create(a,in,min,root.data);
	    }
	    return root;
	}