 public ListNode oddEvenList(ListNode head) {
        ListNode t=head;
        ListNode p=head;
        ListNode x=null;
        int count=0;
        if(head==null)
            return null;
        while(t.next!=null)
        {count++;
        t=t.next;}
        count++;
        int i=1;
        if(count==1 || count==2)
            return head;
        while(p!=null && p.next!=null && i<count)
        {x=p.next;
        // System.out.print(x.val+" ");
         p.next=p.next.next;
         x.next=null;
         t.next=x;
         t=x;
         p=p.next;
         i+=2;
        }
        return head;
    }