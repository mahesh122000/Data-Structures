Node deleteAllOccurances(Node head, int x)
    {
        Node temp=head;
        boolean flag=false;
        while(temp.data==x)
        {if(temp.next==null)
        {head=null;flag=true;break;}
        else
        {temp=temp.next;
        head=temp;}}
        while(temp.next!=null && flag==false)
        {if(temp.next.data==x)
        {Node tt=temp.next;
        temp.next=temp.next.next;
        tt=null;}
        else
        temp=temp.next;}
        return head;
    }