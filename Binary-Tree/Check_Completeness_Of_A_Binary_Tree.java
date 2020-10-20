class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int s=q.size();
            while(s-->0)
            {
                TreeNode n=q.poll();
                if(n==null)
                {
                    while(!q.isEmpty() && q.peek()==null)
                    {
                        q.poll();
                    }
                    if(!q.isEmpty())
                        return false;
                    return true;
                }
                q.add(n.left);
                q.add(n.right);
            }
        }
        return true;
    }
}