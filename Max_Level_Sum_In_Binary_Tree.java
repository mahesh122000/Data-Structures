public static int maxLevelSum(Node root)
         {
         if(root==null)
         return 0;
         int max=0;
         Queue<Node>q=new LinkedList<Node>();
         q.add(root);
         int sum=root.data;
         if(sum>max)
         max=sum;
         while(!q.isEmpty())
         {sum=0;
         int s=q.size();
         while(s--!=0)
         {Node temp=q.poll();
         if(temp.left!=null)
             {sum+=temp.left.data;
             q.add(temp.left);}
         if(temp.right!=null)
             {sum+=temp.right.data;
             q.add(temp.right);}
         }
             if(sum>max)
             max=sum;}
             return max;
          }