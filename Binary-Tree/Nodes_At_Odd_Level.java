class GfG{
    public void nodeAtOdd(Node root)
     {
       Queue<Node>q=new LinkedList<>();
       if(root==null)
       return ;
       q.add(root);
       int l=0;
       while(!q.isEmpty())
       {
           int s=q.size();
           l++;
           while(s-->0)
           {
               Node n=q.poll();
               if(l%2==1)
               System.out.print(n.data+" ");
               if(n.left!=null)
               q.add(n.left);
               if(n.right!=null)
               q.add(n.right);
           }
       }
     }
}