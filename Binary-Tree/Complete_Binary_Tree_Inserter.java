class CBTInserter {

    static class Node
    {
        TreeNode node;
        boolean left;
        boolean right;
        Node(TreeNode node)
        {
            this.node=node;
            left=false;
            right=false;
        }
    }
    Queue<Node>q;
    TreeNode head;
    public CBTInserter(TreeNode root) {
        q=new LinkedList<>();
        head=root;
        Queue<TreeNode>qu=new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty())
        {
            TreeNode n=qu.poll();
            if(n.left==null)
            {
                Node no=new Node(n);
                no.left=no.right=true;
                q.add(no);
            }
            else
            {
                qu.add(n.left);
                if(n.right==null)
                {
                    Node no=new Node(n);
                    no.right=true;
                    q.add(no);
                }
                else
                {
                    qu.add(n.right);
                }
            }
        }
    }
    
    public int insert(int v) {
        Node n=q.peek();
        if(n.left==true)
        {
            TreeNode tn=new TreeNode(v);
            Node no=new Node(tn);
            n.node.left=tn;
            n.left=false;
            no.left=no.right=true;
            q.add(no);
            return n.node.val;
        }
        else
        {
            q.poll();
            TreeNode tn=new TreeNode(v);
            Node no=new Node(tn);
            n.node.right=tn;
            n.right=false;
            no.left=no.right=true;
            q.add(no);
            return n.node.val;
        }
    }
    
    public TreeNode get_root() {
        return head;
    }
}

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(v);
 * TreeNode param_2 = obj.get_root();
 */