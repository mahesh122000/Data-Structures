Node reverseList(Node head)
   {
        Node temp=head;
        Node t=new Node(temp.data);
        temp=temp.next;
        while(temp!=null)
        {Node k=new Node(temp.data);
        k.next=t;
        t=k;
        temp=temp.next;}
        return t;
   }