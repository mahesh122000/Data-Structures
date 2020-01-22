class Rotate {
    
     /*  This function should rotate list counter-
    clockwise by k and return new head (if changed) */
    public Node rotate(Node head, int k) {
        Node temp=head;
        Node tt=head;
        while(tt.next!=null)
        {
        tt=tt.next;}
        tt.next=head;
        while(k-->0)
        {temp=head;
        head=head.next;}
        temp.next=null;
        return head;
    }
}