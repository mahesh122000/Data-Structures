class Tree
{
	public void reversePrint(Node node) 
        {
        Queue<Node>q=new LinkedList<>();
        ArrayList<ArrayList<Integer>>al=new ArrayList<>();
        if(node==null)
        return ;
        q.add(node);
        while(!q.isEmpty())
        {int s=q.size();
        ArrayList<Integer>l=new ArrayList<>();
        while(s-->0)
        {Node t=q.poll();
            if(t.left!=null)
            q.add(t.left);
            if(t.right!=null)
            q.add(t.right);
        l.add(t.data);
        }
        al.add(l);
        }
        for(int i=al.size()-1;i>=0;i--)
        {for(Integer j:al.get(i))
        System.out.print(j+" ");}
        }
}      