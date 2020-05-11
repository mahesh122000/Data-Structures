class Solution {
    public List<TreeNode> generateTrees(int n) {
        if(n==0)
            return new ArrayList<>();
        return build(1,n);
    }
    public List<TreeNode> build(int i,int j)
    {
        List<TreeNode>al=new ArrayList<>();
        if(i>j)
        {al.add(null);
        return al;}
        for(int p=i;p<=j;p++)
        {List<TreeNode>ls=build(i,p-1);
        List<TreeNode>rs=build(p+1,j);
        for(int q=0;q<ls.size();q++)
        {for(int g=0;g<rs.size();g++)
        {TreeNode node=new TreeNode(p);
         TreeNode l=ls.get(q);
         TreeNode r=rs.get(g);
        node.left=l;
        node.right=r;
        al.add(node);}}}
        return al;
    }
}