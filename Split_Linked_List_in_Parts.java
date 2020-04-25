 public ListNode[] splitListToParts(ListNode root, int k) {
        int count=0;
        if(k==0)
            return new ListNode[1];
        ListNode t=root;
        while(t!=null)
        {t=t.next;
        count++;}
        int n=count/k;
        int r=count%k;
        if(n==0)
        {n=1;r=0;}
        ListNode a[]=new ListNode[k];
        ListNode b[]=new ListNode[k];
        t=root;
        int i=0;
        for(int ii=0;ii<k && i<count;ii++)
        {a[ii]=null;
         b[ii]=a[ii];
         if(i<count)
         {ListNode l=new ListNode(t.val);
         a[ii]=l;i++;
         b[ii]=a[ii];
         t=t.next;
         for(int j=1;j<n && i<count;j++,i++)
        {ListNode ll=new ListNode(t.val);
        a[ii].next=ll;
        a[ii]=ll;
        t=t.next;}}
         if(r>0)
         {ListNode ll=new ListNode(t.val);
          a[ii].next=ll;
          a[ii]=ll;
          r--;
          t=t.next;
         }
        }
        return b;
    }