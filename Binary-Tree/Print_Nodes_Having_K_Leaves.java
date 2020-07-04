ArrayList<Integer>al;
    public void btWithKleaves(Node root, int k)
    {
        al=new ArrayList<>();
        int v=find(root.left,0,k)+find(root.right,0,k);
        if(v==k)
        al.add(root.data);
        for(Integer i:al)
        System.out.print(i+" ");
        if(al.size()==0)
        System.out.print("-1");
        System.out.println();
    }
    int find(Node root,int i,int k)
    {
        if(root==null)
        return 0;
        if(root.left==null && root.right==null)
        return 1;
        int v=find(root.left,0,k)+find(root.right,0,k);
        if(v==k)
        al.add(root.data);
        return v;
    }