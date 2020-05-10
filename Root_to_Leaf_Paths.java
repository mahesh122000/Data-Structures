 public void printPaths(Node root){
        String s="";
        if(root==null)
        {System.out.print(s);
        return;}
        find(root,s);
    }
    public void find(Node root,String s)
    {
        if(root.left==null && root.right==null)
        {s+=String.valueOf(root.data)+" #";
        System.out.print(s);
        return ;}
        s+=String.valueOf(root.data)+" ";
        if(root.left!=null)
        find(root.left,s);
        if(root.right!=null)
        find(root.right,s);
    }