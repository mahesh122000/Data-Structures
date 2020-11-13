class Solution {
    public Node connect(Node root) {
        Queue<Node>q = new LinkedList<>();
        if(root==null)
            return root;
        q.add(root);
        while(!q.isEmpty())
        {
            int s=q.size();
            Node pre=null;
            while(s-->0)
            {
                Node n=q.poll();
                if(pre==null)
                    pre=n;
                else
                {
                    pre.next=n;
                    pre=pre.next;
                }
                if(n.left!=null)
                    q.add(n.left);
                if(n.right!=null)
                    q.add(n.right);
            }
        }
        return root;
    }
}