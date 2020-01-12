class Clone {
    Node copyList(Node head) {
        Node temp;
        Node org=head;
        while(head.next!=null)
        {temp=new Node(head.data);
        temp.next=head.next;
        head.next=temp;
        head=temp.next;}
        temp=new Node(head.data);
        head.next=temp;
        Node root=org;
        while(org!=null)
        {if(org.arb!=null)
        {org.next.arb=org.arb.next;}
        org=org.next;
        if(org.next!=null)
        org=org.next;
            else
            break;
        }
        Node copy=root.next;
        while(root.next.next!=null)
        {
        root.next=root.next.next;
        copy.next=copy.next.next;}
        root.next=null;
        
        return copy;
        
        
    }
}
