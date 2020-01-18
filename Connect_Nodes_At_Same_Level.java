class Level
{
    static void connect(Node root)
    {
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {int s=q.size();
        int i=0;
        Node pre=null;
        for(i=0;i<=s;i++)
        {if(i==0)
        {Node temp=q.poll();
        if(temp.left!=null)
        q.add(temp.left);
        if(temp.right!=null)
        q.add(temp.right);
            pre=temp;}
        else if(i==s)
        {pre.nextRight=null;}
        else
        {Node temp=q.poll();
        if(temp.left!=null)
        q.add(temp.left);
        if(temp.right!=null)
        q.add(temp.right);
        pre.nextRight=temp;
        pre=temp;}}}
    }
}