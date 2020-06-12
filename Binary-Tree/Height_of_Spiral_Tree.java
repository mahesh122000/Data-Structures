public static int findTreeHeight(Node root)
        {
            if(root==null)
            return 0;
            Node n=null;
            if(root.right!=null)
            n=root.right;
            if(n!=null && n.left==root)
            return 1;
            return 1+Math.max(findTreeHeight(root.left),findTreeHeight(root.right));
        }