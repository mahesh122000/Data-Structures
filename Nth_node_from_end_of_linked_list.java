int getNthFromLast(Node head, int n)
    {
    	Node t1=head;
    	Node t2=head;
    	for(int i=1;i<n;i++)
    	{t1=t1.next;
    	if(t1==null)
    	return -1;
    	}
    	while(t1.next!=null)
    	{t1=t1.next;
    	t2=t2.next;
    	}
    	return t2.data;
    }