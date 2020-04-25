 ListNode reverse(ListNode head)
    {
        if(head==null)
            return null;
        ListNode n=new ListNode(head.val);
        head=head.next;
        while(head!=null)
        {ListNode t=new ListNode(head.val);
        t.next=n;
        n=t;
        head=head.next;}
        return n;
    }
    public void reorderList(ListNode head) {
        ListNode t=head;
        ListNode s=head;
        if(head==null)
            return ;
        while(s!=null && s.next!=null && s.next.next!=null)
        {s=s.next.next;
        t=t.next;}
        s=t.next;
        t.next=null;
        s=reverse(s);
        t=head;
        while(s!=null)
        {ListNode n=t.next;
        t.next=s;
        ListNode m=s.next;
        s.next=n;
        t=n;
        s=m;}
    }