static class Tree
    {
        boolean isTrue;
        int size;
        int max,min;
        Tree()
        {
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        isTrue = true;
        size = 0;
        }
    }
    static int largestBst(Node root)
    {
        Tree t=postOrder(root);
        return t.size;
    }
    static Tree postOrder(Node root)
    {
        if(root==null)
        return new Tree();
        Tree left=postOrder(root.left);
        Tree right=postOrder(root.right);
        Tree n=new Tree();
        if(left.isTrue==false || right.isTrue==false ||
           left.max>=root.data || root.data>=right.min)
           {
               n.isTrue=false;
               n.size=Math.max(left.size,right.size);
               return n;
           }
           n.isTrue=true;
           n.size=left.size+right.size+1;
           n.min=root.left==null?root.data:left.min;
           n.max=root.right==null?root.data:right.max;
           return n;
    }