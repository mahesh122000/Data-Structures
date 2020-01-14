class GfG
{
	// Complete the function
        Node buildTree(int in[], int post[], int n)
	{
           return build(in,post,0,n-1,0,n-1);
	}
	Node build(int a[],int b[],int l,int r,int m,int n)
	{
	    if(l>r)
	    return null;
	    int k=getpos(a,b[n],l,r);
	    Node root=new Node(b[n]);
	    if(l==r)
	    return root;
	    root.right=build(a,b,k+1,r,m+k-l,n-1);
	    root.left=build(a,b,l,k-1,m,m+k-l-1);
	    return root;
}
int getpos(int a[],int x,int l,int r)
{int i=0;
    for(i=l;i<=r;i++)
{if(a[i]==x)
return i;}
    return -1;
}
}