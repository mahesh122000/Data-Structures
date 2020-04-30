 public ListNode merge(ListNode n,ListNode m)
    {
        if(n==null)
            return m;
        if(m==null)
            return n;
        if(n.val<=m.val)
        {n.next=merge(n.next,m);
        return n;}
        else
        {m.next=merge(n,m.next);
         return m;
        }
    }
    public ListNode sortList(ListNode head) {
        ListNode f=head,s=head;
        if(head==null||head.next==null)
            return head;
        ListNode t=null;
        while(f!=null && f.next!=null)
        {f=f.next.next;
        t=s;
        s=s.next;}
        t.next=null;
        return merge(sortList(head),sortList(s));
    }