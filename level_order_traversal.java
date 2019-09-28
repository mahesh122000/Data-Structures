public static void levelOrder(Node root) {
      
      Queue q=new LinkedList();
      q.add(root);
      while(!q.isEmpty())
      {Node temp=(Node)q.poll();
      System.out.print(temp.data+" ");
      if(temp.left!=null)
      q.add(temp.left);
      if(temp.right!=null)
      q.add(temp.right);}
    }
