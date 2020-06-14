class BinaryTree
{
    static TreeMap<Integer,ArrayList<Integer>>tm;
    static class Tree
    {
        int i;
        Node n;
        Tree(int i,Node n)
        {
            this.i=i;
            this.n=n;
        }
    }
    static void verticalOrder(Node root)
    {
        tm=new TreeMap<>();
        Queue<Tree>q=new LinkedList<>();
        if(root==null)
        return;
        q.add(new Tree(0,root));
        while(!q.isEmpty())
        {
            int s=q.size();
            while(s-->0)
            {
                Tree t=q.poll();
                if(tm.containsKey(t.i))
                {tm.get(t.i).add(t.n.data);}
                else
                {ArrayList<Integer>al=new ArrayList<>();
                al.add(t.n.data);
                tm.put(t.i,al);
                }
                if(t.n.left!=null)
                {q.add(new Tree(t.i-1,t.n.left));}
                if(t.n.right!=null)
                {q.add(new Tree(t.i+1,t.n.right));}
            }
        }
        for(Map.Entry<Integer,ArrayList<Integer>>entry:tm.entrySet())
        {ArrayList<Integer>al=entry.getValue();
        for(Integer i:al)
        System.out.print(i+" ");
        }
}}