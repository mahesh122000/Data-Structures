class BSTIterator {
    Stack<TreeNode>st=new Stack<>();
    public BSTIterator(TreeNode root) {
        pushToLeft(root);
    }
    
    /** @return the next smallest number */
    public int next() {
        TreeNode temp=st.pop();
        pushToLeft(temp.right);
        return temp.val;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(st.isEmpty())
            return false;
        return true;
    }
    public void pushToLeft(TreeNode temp)
    {if(temp!=null)
    {st.push(temp);
    pushToLeft(temp.left);}
    }
}