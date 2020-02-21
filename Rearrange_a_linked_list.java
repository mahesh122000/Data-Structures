 Node rearrange(Node head)
    {
         Queue<Integer>q=new LinkedList<>();
         Node temp=head;
         while(temp.next!=null)
         {if(temp.next!=null)
         {q.add(temp.next.data);
         if(temp.next.next==null)
         {temp.next=null;break;}
         temp.next=temp.next.next;
         temp=temp.next;}}
         if(temp.next!=null)
         temp=temp.next;
         while(!q.isEmpty())
         {Node n=new Node(q.poll());
         temp.next=n;
         temp=n;
         }