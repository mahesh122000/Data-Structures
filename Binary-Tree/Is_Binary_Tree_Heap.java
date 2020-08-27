class GfG
{
    /*You are required to complete this method */
    boolean isHeap(Node tree)
    {
	   if(tree==null)
	   return true;
	   boolean l=isHeap(tree.left);
	   boolean r=isHeap(tree.right);
	   if(l && r)
	   {
	       if(tree.left!=null)
	       {
	           if(tree.left.data<tree.data)
	           {
	               if(tree.right!=null)
	               {
	                   if(tree.right.data<tree.data)
	                   return true;
	                   return false;
	               }
	               return true;
	           }
	           return false;
	       }
	       return true;
	   }
	   return false;
    }
}