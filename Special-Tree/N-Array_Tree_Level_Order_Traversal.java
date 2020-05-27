class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node>q=new LinkedList<>();
        List<List<Integer>>al=new ArrayList<>();
        if(root==null)
            return al;
        q.add(root);
        while(!q.isEmpty())
        {
            int s=q.size();
            List<Integer>l=new ArrayList<>();
            while(s-->0)
            {
                Node t=q.poll();
                l.add(t.val);
                for(Node n:t.children)
                    q.add(n);
            }
            al.add(l);
        }
    return al;
    }
}