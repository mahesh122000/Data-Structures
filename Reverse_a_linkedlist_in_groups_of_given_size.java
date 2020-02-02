public static Node ans(Node node,int n)
    {int k=n;
    if(node==null)
    return null;
    Node temp=node;
    Node t=new Node(temp.data);
    Node tt=t;
    k--;
    boolean flag=false;
    while(k-->0 && temp.next!=null)
    {temp=temp.next;
    Node ttt=new Node(temp.data);
    ttt.next=t;
    t=ttt;}
    if(temp.next==null)
    {flag=true;}
    if(flag)
    {}
    else
    {temp=temp.next;
    tt.next=ans(temp,n);}
    return t;
    }
    public static Node reverse(Node node, int k)
    {
        node=ans(node,k);
        return node;
    }