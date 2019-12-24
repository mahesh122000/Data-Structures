class GfG
{
	public static int treePathsSum(Tree root)
        {
            if(root==null)
            return 0;
            ArrayList<Integer>al=new ArrayList<>();
            ans(root,root.data,al);
            int sum=0;
            Iterator<Integer>it=al.iterator();
            while(it.hasNext())
            {sum+=it.next();}
            return sum;
	}
	public static void ans(Tree root,int a,ArrayList<Integer>al)
	{if(root.left==null && root.right==null)
	{al.add(a);
	return;}
	ans(root.left,(a*10)+root.left.data,al);
	ans(root.right,(a*10)+root.right.data,al);
}}