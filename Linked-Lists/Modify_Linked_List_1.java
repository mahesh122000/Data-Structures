static int n;
    Node reverse(Node root)
    {
        int count=0;
        if(root==null)
        {
            n=0;
            return root;
        }
        Node s=null;
        while(root!=null)
        {
            if(s==null)
            {
                s=new Node(root.data);
            }
            else
            {
                Node n=new Node(root.data);
                n.next=s;
                s=n;
            }
            count++;
            root=root.next;
        }
        n=count;
        return s;
    }
    public Node modify(Node head){
        Node f=head;
        n=0;
        Node s=reverse(head);
        Node ans=f;
        int k=n/2;
        while(k-->0)
        {
            f.data=f.data-s.data;
            s=s.next;
            f=f.next;
        }
        return ans;
    }
    void show(Node head)
    {
        while(head!=null)
        {System.out.print(head.data+" ");
        head=head.next;}
        //System.out.println();
    }