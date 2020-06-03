         public Node deleteNode(Node root,int x)
         {
         if(root==null)
         return null;
         root.left=deleteNode(root.left,x);
         root.right=deleteNode(root.right,x);
         if(root.data>=x)
         return root.left;
         return root;
         }