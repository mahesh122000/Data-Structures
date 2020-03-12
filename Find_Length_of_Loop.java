int countNodesinLoop(Node head)
    {
	    HashMap<Node,Integer>hm=new HashMap<>();
	    int count=0;
	    int ans=0;
	    while(head!=null)
	    {if(hm.containsKey(head))
	    {int k=hm.get(head);
	    ans=count-k;
	    break;}
	    else
	    {hm.put(head,count);}
	    head=head.next;
	    count++;}
	    return ans;
    }