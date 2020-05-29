public Node arrangeCV(Node head){
        Node temp=head;
        Node t1=new Node('0');
        Node t2=new Node('0');
        head=t1;
        Node t3=t2;
        while(temp!=null)
        {char c=temp.data;
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {Node t=new Node(c);
        t1.next=t;
        t1=t;}
        else
        {Node t=new Node(c);
        t2.next=t;
        t2=t;}
         temp=temp.next;}
    t1.next=t3.next;
    return head.next;}