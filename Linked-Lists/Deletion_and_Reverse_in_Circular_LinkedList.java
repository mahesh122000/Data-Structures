public static Node deleteNode(Node head,int d)
    {
        Node t=head;
        Node p=head.next;
        while(p.data!=d)
        {
            t=t.next;
            p=p.next;
        }
        t.next=p.next;
        if(head.data==d)
        {
            head=p.next;
        }
        return head;
    }
    //This method returns the head node of the reversed Linked list.
    public static Node reverse(Node head)
    {
        Node cur=head;
        Node pre=null;
        Node next=null;
        Node t=head;
        while(true)
        {
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
            if(cur==t)
            break;
        }
        head=pre;
        t.next=pre;
        return head;
    }
}