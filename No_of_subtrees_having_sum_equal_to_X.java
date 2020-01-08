class GFG
{
    int countSubtreesWithSumX(Node root, int x)
    {
	if(root==null)
	return 0;
	int a=countSubtreesWithSumX(root.left,x);
	int b=countSubtreesWithSumX(root.right,x);
	if(root.left!=null)
	root.data=root.data+root.left.data;
	if(root.right!=null)
	root.data=root.data+root.right.data;
	if(root.data==x)
	return a+b+1;
	else
	return a+b;
    }
}