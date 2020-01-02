class Tree
{
    void leftView(Node node)
    {
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        String ans="";
        while(!q.isEmpty())
        {
        int s=q.size();
        for(int i=0;i<s;i++)
        {Node root=q.poll();
        if(i==0)
        {ans=ans+String.valueOf(root.data)+" ";}
        if(root.left!=null)
        q.add(root.left);
        if(root.right!=null)
        q.add(root.right);}}
    System.out.print(ans);
    }
}
