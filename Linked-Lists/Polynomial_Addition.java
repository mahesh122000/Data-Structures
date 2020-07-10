class GFG
{
    public static Node addPolynomial(Node p1,Node p2)
    {
        Node ans=null;
        Node n=null;
        while(p1!=null && p2!=null)
        {
            if(p1.pow>p2.pow)
            {
                if(n==null)
                {
                    n=new Node(p1.coeff,p1.pow);
                    ans=n;
                }
                else
                {
                    Node t=new Node(p1.coeff,p1.pow);
                    n.next=t;
                    n=t;
                }
                p1=p1.next;
            }
            else if(p1.pow<p2.pow)
            {
                if(n==null)
                {
                    n=new Node(p2.coeff,p2.pow);
                    ans=n;
                }
                else
                {
                    Node t=new Node(p2.coeff,p2.pow);
                    n.next=t;
                    n=t;
                }
                p2=p2.next;
            }
            else
            {
                if(n==null)
                {
                    n=new Node(p1.coeff+p2.coeff,p1.pow);
                    ans=n;
                }
                else
                {
                    Node t=new Node(p1.coeff+p2.coeff,p1.pow);
                    n.next=t;
                    n=t;
                }
                p1=p1.next;
                p2=p2.next;
            }
        }
        while(p1!=null)
        {
                if(n==null)
                {
                    n=new Node(p1.coeff,p1.pow);
                    ans=n;
                }
                else
                {
                    Node t=new Node(p1.coeff,p1.pow);
                    n.next=t;
                    n=t;
                }
                p1=p1.next;
        }
        while(p2!=null)
        {
                if(n==null)
                {
                    n=new Node(p2.coeff,p2.pow);
                    ans=n;
                }
                else
                {
                    Node t=new Node(p2.coeff,p2.pow);
                    n.next=t;
                    n=t;
                }
                p2=p2.next;
        }
        return ans;
    }
}