class GfG
{
     public void diagonalPrint(TreeNode root)
      {
           Queue<TreeNode>q=new LinkedList<>();
           q.add(root);
           while(root.right!=null)
           {q.add(root.right);
           root=root.right;}
           while(!q.isEmpty())
           {
               int s=q.size();
               while(s--!=0)
               {TreeNode temp=q.poll();
               System.out.print(temp.data+" ");
               if(temp.left!=null)
               {q.add(temp.left);
               temp=temp.left;
               while(temp.right!=null)
               {q.add(temp.right);
               temp=temp.right;}}}
               
           }
      }
}