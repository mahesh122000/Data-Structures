 public static int preIndex;
    GfG(int ind)
    {
        preIndex = ind;
    }
    
  public static Node buildTree(int ino[], int pre[], int st, int end)
    {  if(st>end)
        return null;
       Node root=new Node(pre[preIndex++]);
       if(st==end)
       return root;
       int ind=-1;
       for(int i=st;i<=end;i++)
       {if(ino[i]==root.data)
       {ind=i;break;}}
       if(ind<=end)
       {root.left=buildTree(ino,pre,st,ind-1);
       root.right=buildTree(ino,pre,ind+1,end);}
       return root;
    }
}

