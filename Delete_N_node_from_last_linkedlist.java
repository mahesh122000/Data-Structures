public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int count=0;
        while(temp!=null)
        {count++;
        temp=temp.next;}
        if(n>count)
        {n=count;}
        if(n==count)
        {head=head.next;
        return head;}
        else
        {temp=head;
         for(int i=0;i<n;i++)
        {temp=temp.next;
        }
        ListNode tt=head;
        ListNode t=tt;
         while(temp.next!=null)
        {
        tt=tt.next;
        temp=temp.next;}
        tt.next=tt.next.next;
        return head;}
    }