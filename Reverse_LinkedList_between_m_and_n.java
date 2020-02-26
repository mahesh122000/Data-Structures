class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode a=null,b=null,t1=head,t2=head;
        while(--m>0)
        {a=t1;
        t1=t1.next;}
        while(--n>0)
        {t2=t2.next;}
        if(t2.next==null)
        {}
        else
        {b=t2.next;}
        t2.next=null;
        ListNode temp=new ListNode(t1.val);
        t1=t1.next;
        ListNode kk=temp;
        while(t1!==null)
        {ListNode t=new ListNode(t1.val);
        t.next=temp;
         t1=t1.next;
        temp=t;}
        while(temp!=null)
        {System.out.print(temp.val+" ");
        temp=temp.next;}
        if(a==null)
            head=temp;
        else
        {a.next=temp;}
        if(b==null)
            kk.next=null;
        else
            kk.next=b;
        return head;
    }
}