static int max;
    public static int maxPathSum(Node root) {
        max=Integer.MIN_VALUE;
        find(root);
        return max;
    }
    public static int find(Node root)
    {
        if(root==null)
        return Integer.MIN_VALUE;
        if(root.left==null && root.right==null)
        return root.data;
        boolean flag1=false;
        boolean flag2=false;
        int k=Integer.MIN_VALUE,kk=Integer.MIN_VALUE;
        if(root.left!=null)
        {k=find(root.left);
        flag1=true;}
        if(root.right!=null)
        {kk=find(root.right);
        flag2=true;}
        if(flag1 && flag2)
        {int val=k+kk+root.data;
        if(val>max)
        max=val;}
        return Math.max(k,kk)+root.data;
    }