public static void findPreSuc(Node root, Res p, Res s, int key)
    {
       if(root==null)
       return;
       findPreSuc(root.left,p,s,key);
       if(key>root.data)
       p.pre=root;
       if(key<root.data && s.succ==null)
       s.succ=root;
       findPreSuc(root.right,p,s,key);
    }