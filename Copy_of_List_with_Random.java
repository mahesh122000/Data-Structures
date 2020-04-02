public Node copyRandomList(Node head) {
       Node temp=head;
        if(temp==null)
            return null;
        while(temp!=null)
        {Node n=new Node(temp.val);
        n.next=temp.next;
        temp.next=n;
        temp=temp.next.next;}
        temp=head;
        while(temp!=null)
        {if(temp.random!=null)
            temp.next.random=temp.random.next;
        temp=temp.next.next;}
        temp=head;
        Node ans=new Node(-1);
        Node n=ans;
        while(temp!=null)
        {ans.next=temp.next;
        temp.next=temp.next.next;
        ans=ans.next;
        temp=temp.next;}
        return n.next;
    }