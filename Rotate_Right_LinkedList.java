public ListNode rotateRight(ListNode head, int k) {
        int n=0;
        ListNode temp=head;
        if(head==null)
            return null;
        ListNode pre=head;
        while(pre.next!=null)
        {n++;
        pre=pre.next;}
        n++;
        k=k%n;
        k=n-k;
        if(k==0)
            return head;
        pre.next=head;
        while(k-->0)
        {temp=head;
        head=head.next;}
        temp.next=null;
        return head;
    }