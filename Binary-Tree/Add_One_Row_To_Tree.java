class Solution {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        d=d-1;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        if(d==0)
        {
            TreeNode n=new TreeNode(v);
            n.left=root;
            return n;
        }
        while(!q.isEmpty())
        {
            int s=q.size();
            d--;
            while(s-->0)
            {
                TreeNode n=q.poll();
                if(n.val==4)
                    System.out.println(d);
                if(d==0)
                {
                    if(n.left!=null)
                    {
                        TreeNode temp=n.left;
                        n.left=new TreeNode(v);
                        n.left.left=temp;
                    }
                    else
                    {
                        n.left=new TreeNode(v);
                    }
                    if(n.right!=null)
                    {
                        TreeNode temp=n.right;
                        n.right=new TreeNode(v);
                        n.right.right=temp;
                    }
                    else
                    {
                        n.right=new TreeNode(v);
                    }
                    
                }
                else
                {
                    if(n.left!=null)
                        q.add(n.left);
                    if(n.right!=null)
                        q.add(n.right);
                }
                
            }
            if(d==0)
                break;
        }
        return root;
    }
}