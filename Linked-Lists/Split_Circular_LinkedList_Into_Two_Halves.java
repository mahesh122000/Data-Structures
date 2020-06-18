void splitList(circular_LinkedList list)
        {
            HashSet<Node>hs=new HashSet<>();
        if(list.head==null)
        return ;
        if(list.head.next==list.head)
        return ;
        Node n=list.head;
        Node p=null;
        int count=0;
        while(n!=null)
        {
            count++;
            if(hs.contains(n))
            {p.next=null;
            break;    
            }
            else
            {p=n;
            hs.add(n);
            n=n.next;}
        }
        Node f=list.head;
        list.head1=list.head;
        count=count/2;
        while(--count>0)
        {
            f=f.next;
        }
        Node t=f.next;
        list.head2=t;
        f.next=list.head1;
        p.next=list.head2;
	    }