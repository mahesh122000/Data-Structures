class Solution {
    static class Node
    {
        TreeNode t;
        boolean isNode;
        Node(TreeNode t,boolean isNode)
        {
            this.t=t;
            this.isNode=isNode;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Deque<Node>dq=new ArrayDeque<>();
        if(root==null)
            return 0;
        dq.addLast(new Node(root,true));
        int ans=0;
        while(!dq.isEmpty())
        {
            while(!dq.isEmpty() && dq.getFirst().isNode==false)
                dq.removeFirst();
            while(!dq.isEmpty() && dq.getLast().isNode==false)
                dq.removeLast();
            int s=dq.size();
            ans=Math.max(ans,s);
            for(int i=0;i<s;i++)
            {
                Node n=dq.poll();
                if(n.isNode==false)
                {
                    dq.add(new Node(null,false));
                    dq.add(new Node(null,false));
                }
                else
                {
                    dq.add(new Node(n.t.left,n.t.left!=null));
                    dq.add(new Node(n.t.right,n.t.right!=null));
                }
            }
        }
        return ans;
    }
}