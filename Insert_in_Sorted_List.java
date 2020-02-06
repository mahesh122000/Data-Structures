Node sortedInsert(Node head1,int key)
	{
	    Node temp=head1;
	    if(key<=head1.data)
	    {Node t=new Node(key);
	    t.next=head1;
	    head1=t;
	        return head1;
	    }
	    else
	    {while(temp!=null)
	    {if(temp.data<=key)
	    {if(temp.next!=null)
	    {if(temp.next.data>key)
	    {Node t=new Node(key);
	    t.next=temp.next;
	    temp.next=t;break;}
	    else
	    {temp=temp.next;}
	    }
	    else
	    {Node t=new Node(key);
	    temp.next=t;break;}}}
	        return head1;
	    }
	}