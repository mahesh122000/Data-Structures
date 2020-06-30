class NumArray {
    class Tree
    {
        int s,e,v;
        Tree left,right;
        Tree(int a,int b,int c)
        {s=a;
        e=b;
        v=c;
        }
    }
    Tree root;
    int n[];

    public NumArray(int[] nums) {
        if(nums.length==0)
            return;
        n=nums;
        root=build(0,nums.length-1,nums);
    }
    public Tree build(int i,int l,int a[])
    {if(i==l)
     return new Tree(i,l,a[i]);
    int m=(i+l)>>1;
    Tree cur=new Tree(i,l,0);
    cur.left=build(i,m,a);
    cur.right=build(m+1,l,a);
    cur.v=cur.left.v+cur.right.v;
    return cur;
    }
    
    public void update(int i, int val) {
    updateTree(i,val,root);
        n[i]=val;
    }
    public void updateTree(int i,int v,Tree root)
    {
        while(root.s!=root.e)
        {int l=root.s;
        int r=root.e;
        int m=(l+r)>>1;
        root.v=root.v-n[i]+v;
        if(i<=m)
         root=root.left;
        else
         root=root.right;
        }
        root.v=v;
    }
    
    public int sumRange(int i, int j) {
        return sum(i,j,root);
    }
    public int sum(int i,int j,Tree root)
    {
        if(i==root.s && j==root.e)
            return root.v;
        int ans=0;
        int l=root.s;
        int r=root.e;
        int m=(l+r)>>1;
        if(i<=m && j>m)
        {ans+=sum(i,m,root.left);
        ans+=sum(m+1,j,root.right);}
        else if(i<=m && j<=m)
            ans+=sum(i,j,root.left);
        else 
            ans+=sum(i,j,root.right);
        return ans;
    }
}

