static ArrayList<Integer>al;
    public void inorder(Node root)
    {
        if(root==null)
        return ;
        inorder(root.left);
        al.add(root.data);
        inorder(root.right);
    }
    public int isPairPresent(Node root,int k)
    {
        al=new ArrayList<>();
        inorder(root);
        int i=0,j=al.size()-1;
        while(i<j)
        {if(al.get(i)+al.get(j)==k)
        return 1;
        else if(al.get(i)+al.get(j)<k)
        i++;
        else
        j--;
        }
        return 0;
    }