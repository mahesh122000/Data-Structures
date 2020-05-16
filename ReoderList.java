class gfg {
    Node reorderlist(Node head) {
        Node f=head;
        Node s=head;
        if(head==null || head.next==null|| head.next.next==null)
        return head;
        while(s.next!=null && s.next.next!=null)
        {s=s.next.next;
        f=f.next;}
        Node t=f.next;
        f.next=null;
        t=reverse(t);
        s=head;
        while(s!=null)
        {if(t.next==null)
        {t.next=s.next;
        s.next=t;
        break;}
        else
        {Node x=t;
        t=t.next;
        x.next=s.next;
        s.next=x;}
        s=s.next.next;}
        return head;
    }
    Node reverse(Node root)
    {
        Node x=null;
        while(root!=null)
        {
            if(x==null)
            {x=new Node(root.data);}
            else
            {Node n=new Node(root.data);
            n.next=x;
            x=n;}
            root=root.next;
        }
        return x;
    }
}