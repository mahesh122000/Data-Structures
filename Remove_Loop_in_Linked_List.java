class Loop{
    
    // This function will remove the loop from the linked list
    public static void removeTheLoop(Node head)
    {
        HashSet<Node>hs=new HashSet<>();
        Node temp=head;
        hs.add(temp);
        while(temp.next!=null)
        {if(hs.contains(temp.next))
        {temp.next=null;break;}
        else
        {hs.add(temp.next);
        temp=temp.next;}}
    }
}