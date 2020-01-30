int detectLoop(Node head) {
        HashSet<Node>hs=new HashSet<Node>();
        boolean flag=false;
        while(head!=null)
        {if(hs.contains(head))
        {flag=true;break;}
        else
        hs.add(head);
        head=head.next;}
    if(flag)
        return 1;
    else
        return 0;
    }