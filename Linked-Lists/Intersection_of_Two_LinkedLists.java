public static Node findIntersection(Node head1, Node head2)
    {
        Node t=null;
        Node ans=t;
        while(head1!=null && head2!=null)
        {
            if(head1.data==head2.data)
            {if(t==null)
            {t=new Node(head1.data);
            ans=t;    
            }
            else
            {t.next=new Node(head1.data);
            t=t.next;}
            head1=head1.next;
            head2=head2.next;
            }
            else if(head1.data<head2.data)
            head1=head1.next;
            else
            head2=head2.next;
        }
        return ans;
    }