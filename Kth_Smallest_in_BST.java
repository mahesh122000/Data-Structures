class Solution {
    ArrayList<Integer>al=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        if(root==null)
            return 0;
        inorder(root);
        return al.get(k-1);
    }
    public void inorder(TreeNode root)
    {if(root==null)
            return ;
        if(root.left!=null)
            inorder(root.left);
         al.add(root.val);
         if(root.right!=null)
             inorder(root.right);
    }
}