public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode f=head,s=head;
        while(f!=null && f.next!=null)
        {
            f=f.next.next;
            s=s.next;
            if(f==s)
            {
                ListNode r=head;
                while(true)
                {
                    if(r==s)
                        return s;
                    s=s.next;
                    r=r.next;
                }
            }
        }
        return null;
    }
}