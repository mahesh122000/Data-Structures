static void reverseAlternate( Node root)  
    {  
       Queue<Node>q=new LinkedList<>();
       if(root==null)
       return ;
       q.add(root);
       int l=0;
       ArrayList<Integer>al=new ArrayList<>();
       while(!q.isEmpty())
       {
           int s=q.size();
           while(s-->0)
           {
               Node n=q.poll();
               if(n.left!=null)
               {
                   if(l%2==0)
                   al.add(0,n.left.data);
                   q.add(n.left);
               }
               if(n.right!=null)
               {
                   if(l%2==0)
                   al.add(0,n.right.data);
                   q.add(n.right);
               }
               if(l%2==1)
               {
                   n.data=al.get(0);
                   al.remove(0);
               }
           }
           l++;
       }
    }  