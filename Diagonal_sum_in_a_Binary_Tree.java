class GfG {
    public void diagonalsum(Node root) {
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(root.right!=null)
        {root=root.right;
        q.add(root);}
        while(!q.isEmpty())
        {int s=q.size();
        int sum=0;
        while(s--!=0)
        {Node temp=q.poll();
        sum+=temp.data;
        if(temp.left!=null)
        {temp=temp.left;
        q.add(temp);
        while(temp.right!=null)
        {temp=temp.right;
        q.add(temp);}}}
        System.out.print(sum+" ");}
    }
}