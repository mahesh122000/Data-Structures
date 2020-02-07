static Node getmid(Node head)
    {
        Node f=head,s=head;
        while(s.next!=null && s.next.next!=null)
        {f=f.next;
        s=s.next.next;}
        return f;
    }
    static Node mergeSort(Node head)
    {
        if(head==null || head.next==null)
        return head;
        Node mid=getmid(head);
        Node temp=mid.next;
        mid.next=null;
        Node left=mergeSort(head);
        Node right=mergeSort(temp);
        Node ans=merge(left,right);
        return ans;
    }
    static Node merge(Node a,Node b)
    {
        if(a==null)
        return b;
        if(b==null)
        return a;
        Node ans=null;
        if(a.data<=b.data)
        {ans=a;
        ans.next=merge(a.next,b);}
        else
        {ans=b;
        ans.next=merge(a,b.next);}
        return ans;
    }