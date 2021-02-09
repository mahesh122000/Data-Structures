class Solution {
    Stack<Integer>st;
    public TreeNode convertBST(TreeNode root) {
        st=new Stack<>();
        st.add(0);
        TreeNode head=root;
        traverse(head);
       
        fill(root);
        return root;
    }
    void traverse(TreeNode root)
    {
       if(root==null)
           return;
        traverse(root.right);
        int k=root.val+st.peek();
        st.add(k);
        traverse(root.left);
    }
    void fill(TreeNode root)
    {
       if(root==null)
           return;
        fill(root.left);
        root.val=st.pop();
        fill(root.right);
    }
}