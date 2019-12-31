class GfG
{
	Node sortedList(Node head)
	{
		Node temp=head;
		while(temp.next!=null)
		{if(temp.next.data>=temp.data)
		{temp=temp.next;}
		else
		{Node tt=temp.next;
		temp.next=temp.next.next;
		tt.next=head;
		head=tt;
		}}
		return head;
	}
}