class Solution {
    public List<Integer> largestValues(TreeNode root) {
       List<Integer>l=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null)
            return l;
        q.add(root);
        while(!q.isEmpty())
        {
            int max=Integer.MIN_VALUE;
            int s=q.size();
            while(s-->0)
            {
                TreeNode n=q.poll();
                max=Math.max(max,n.val);
                if(n.left!=null)
                    q.add(n.left);
                if(n.right!=null)
                    q.add(n.right);
            }
            l.add(max);
        }
        return l;
    }
}