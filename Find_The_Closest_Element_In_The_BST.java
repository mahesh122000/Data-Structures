class GfG
{
      public static int maxDiff(Node root, int k)
       {int min=99999;
           if(root.left==null && root.right==null)
           return Math.abs(k-root.data);
           min=Math.min(min,Math.abs(root.data-k));
           if(root.left!=null && root.data>k)
           min=Math.min(min,maxDiff(root.left,k));
           else if(root.right!=null && root.data<k)
           min=Math.min(min,maxDiff(root.right,k));
           return min;
       }
}