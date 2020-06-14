class View
{
    static TreeMap<Integer,Integer>tm;
    static class Tre
    {
        int i;
        Node n;
        Tre(int i,Node n)
        {
            this.i=i;
            this.n=n;
        }
    }
    static void topView(Node root)
    {
        tm=new TreeMap<>();
        Queue<Tre>q=new LinkedList<>();
        if(root==null)
        return;
        q.add(new Tre(0,root));
        while(!q.isEmpty())
        {
            int s=q.size();
            while(s-->0)
            {
                Tre t=q.poll();
                if(!tm.containsKey(t.i))
                {tm.put(t.i,t.n.data);}
                if(t.n.left!=null)
                {q.add(new Tre(t.i-1,t.n.left));}
                if(t.n.right!=null)
                {q.add(new Tre(t.i+1,t.n.right));}
            }
        }
        for(Map.Entry<Integer,Integer>entry:tm.entrySet())
        {int i=entry.getValue();
        System.out.print(i+" ");
        }
    }
}