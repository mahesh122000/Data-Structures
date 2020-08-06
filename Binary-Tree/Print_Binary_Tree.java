class Solution {
     static class Node
     {
         TreeNode n;
         int l;
         int h;
         Node(TreeNode n,int l,int h)
         {
             this.n=n;
             this.l=l;
             this.h=h;
         }
     }
    public List<List<String>> printTree(TreeNode root) {
        Queue<Node>q=new LinkedList<>();
        List<List<String>>al=new ArrayList<>();
        if(root==null)
            return al;
        int h=height(root);
        int k=(int)Math.pow(2,h)-1;
        q.add(new Node(root,0,k));
        while(!q.isEmpty())
        {
            int s=q.size();
            List<String>l=new ArrayList<>();
            for(int j=0;j<k;j++)
                l.add("");
            while(s-->0)
            {
                Node no=q.poll();
                int m=(no.l+no.h)>>1;
                l.set(m,no.n.val+"");
                if(no.n.left!=null)
                    q.add(new Node(no.n.left,no.l,m-1));
                if(no.n.right!=null)
                    q.add(new Node(no.n.right,m+1,no.h));
            }
            al.add(l);
        }
        return al;
    }
    int height(TreeNode n)
    {
        if(n==null)
            return 0;
        return 1+Math.max(height(n.left),height(n.right));
    }
}



