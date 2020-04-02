void find(Node root,PriorityQueue<Integer>pq)
    {
        if(root==null)
        return ;
        if(root.left!=null)
        find(root.left,pq);
        pq.add(root.data);
        if(root.right!=null)
        find(root.right,pq);
    }
    Node binaryTreeToBST(Node root)
    {
       PriorityQueue<Integer>pq=new PriorityQueue<>();
       find(root,pq);
       build(root,pq);
       return root;
    }
   void build(Node root,PriorityQueue<Integer>pq)
    {
        if(root==null)
        return ;
        if(root.left!=null)
        build(root.left,pq);
        root.data=pq.remove();
        if(root.right!=null)
        build(root.right,pq); 
    }