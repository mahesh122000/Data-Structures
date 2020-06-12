class Solution {
    public Node flatten(Node head) {
        Node t=head;
        if(head==null)
            return head;
        while(t!=null)
        {if(t.child!=null)
        {Node n=t.next;
        Node p=flatten(t.child);
        t.next=p;
        p.prev=t;
        t.child=null;
        while(t.next!=null)
        {t=t.next;}
        t.next=n;
        if(n!=null)
        n.prev=t;}
        else
        {t=t.next;}}
        t=head;
        while(t!=null)
        {t.child=null;
        t=t.next;}
        return head;
    }
}