 public ListNode insertionSortList(ListNode head) {
        ListNode t=head;
        if(head==null)
            return head;
        int k=head.val;
        while(t!=null && t.next!=null)
        {
            if(t.next.val>=k)
            {t=t.next;}
            else
            {
                ListNode n=head;
                if(head.val>t.next.val)
                {ListNode p=new ListNode(t.next.val);
                p.next=head;
                head=p;
                }
                else
                {while(n!=null && n.next!=null && n.next.val<=t.next.val)
                    n=n.next;
                ListNode p=n.next;
                n.next=new ListNode(t.next.val);
                n=n.next;
                n.next=p;}
                t.next=t.next.next;
            }
            k=t.val;
        }
        return head;
    }