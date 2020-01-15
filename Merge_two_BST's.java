	public static void merge(Node root1 , Node root2)
    {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        ans(root1,pq);
        ans(root2,pq);
        while(!pq.isEmpty())
        {System.out.print(pq.poll()+" ");}
    }
    public static void ans(Node root,PriorityQueue<Integer> pq)
    {
        if(root==null)
        return ;
        ans(root.left,pq);
        pq.add(root.data);
        ans(root.right,pq);
    }