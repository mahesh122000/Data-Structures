class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1)
            return head;
        int n=0;
        ListNode t=head;
        while(t!=null)
        {n++;
        t=t.next;}
        t=head;
        int d=n/k;
        int r=n%k;
        ListNode p=t;
        ListNode ans=head;
        ListNode te=null;
        while(d-->0)
        {int m=k;
         ListNode c=t;
         while(--m>0)
         {
             t=t.next;
         }
         if(t!=null)
         {p=t.next;
         t.next=null;}
         else 
         p=null;
         ListNode cu=c; 
         if(te==null)
         {te=reverse(c);
          ans=te;
         }
         else
         {te.next=reverse(c);}
         te=cu;
        if(t!=null)
        t=p;
        }
        if(p!=null)
            te.next=p;
        return ans;
    }
    ListNode reverse(ListNode root)
    {
        ListNode t=null;
        if(root==null)
            return root;
        while(root!=null)
        {ListNode p=root.next;
         root.next=null;
            if(t==null)
            {t=root;}
            else
            {root.next=t;
            t=root;}
         root=p;
        }
        return t;
    }
}