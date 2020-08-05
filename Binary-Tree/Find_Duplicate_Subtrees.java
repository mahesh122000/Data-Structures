class Solution {
    static HashSet<TreeNode>ans;
    static HashSet<String>subtrees;
    static HashSet<String>added;
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        ans=new HashSet<>();
        subtrees=new HashSet<>();
        added=new HashSet<>();
        traverse(root);
        return new ArrayList<TreeNode>(ans);
    }
    String traverse(TreeNode root)
    {
        if(root==null)
            return "#";
        String left=traverse(root.left);
        String right=traverse(root.right);
        String cur=left+right+root.val;
        if(subtrees.contains(cur) && !added.contains(cur))
        {
            ans.add(root);
            added.add(cur);
        }
        subtrees.add(cur);
        return cur;
    }
}