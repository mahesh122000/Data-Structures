class Solution {
    List<String>l;
    public String smallestFromLeaf(TreeNode root) {
        l=new ArrayList<>();
        fill(root,"");
        Collections.sort(l);
        if(l.size()==0)
            return "";
        return l.get(0);
    }
    void fill(TreeNode root,String s)
    {
        if(root==null)
            return ;
        if(root.left==null && root.right==null)
        {
            l.add((char)('a'+root.val)+s);
            return;
        }
        String c=(char)('a'+root.val)+s;
        fill(root.left,c);
        fill(root.right,c);
    }
}