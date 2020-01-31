	public static void zigzag(Node node){
        Node temp=find(node);
        while(temp!=null)
        {System.out.print(temp.data+" ");
	    temp=temp.next;}
	    System.out.println();
	}
    public static Node find(Node node)
    {   if(node==null || node.next==null)
        return node;
        Node temp=node;
        int a=temp.data;
        int b=temp.next.data;
        temp.data=Math.min(a,b);
        temp.next.data=Math.max(a,b);
        if(temp.next.next!=null)
        {if(temp.next.next.data>temp.next.data)
        {int k=temp.next.next.data;
        temp.next.next.data=temp.next.data;
        temp.next.data=k;}
        }
        temp.next.next=find(temp.next.next);
        return node;}
}