 int height(Node node) 
    {
         int count=0;
         if(node==null)
         return 0;
         else
         return 1+Math.max(height(node.left),height(node.right));
    }  