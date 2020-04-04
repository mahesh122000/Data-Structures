 public ListNode partition(ListNode head, int x) {
        ListNode temp=head;
        ListNode pre=head;
        ListNode cur=new ListNode(-1);
        ListNode p=cur;
        cur.next=head;
        head=cur;
        while(temp!=null && temp.val<x)
        {p=temp;
        temp=temp.next;
        cur=pre;
        pre=pre.next;}
        while(temp!=null && temp.next!=null)
        {if(temp.val>=x)
        {p=temp;
        temp=temp.next;}
        else
        {int k=temp.val;
        p.next=temp.next;
        temp=p.next;
        ListNode t=new ListNode(k);
        cur.next=t;
        cur=t;
        cur.next=pre;
        }}
        if(temp!=null && temp.val<x)
        {p.next=null;
        int k=temp.val;
        ListNode t=new ListNode(k);
        cur.next=t;
        cur=t;
        cur.next=pre;}
        return head.next;
        }