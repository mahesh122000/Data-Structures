	public static void insert(Node head,int value,int l)
         {
             
            if(head==null)
            {
                Node n=new Node(value);
                n.next=n;
                head=n;
                return ;
            }
            Node t=head;
            Node p=null;
            HashSet<Node>hs=new HashSet<>();
            while(t!=null)
             {
                if(hs.contains(t))
                {
                    p.next=null;
                    break;
                }
                else
                {
                    p=t;
                    hs.add(t);
                    t=t.next;
                }
             }
             t=head;
            if(head.data>value)
            {
                Node n=new Node(value);
                n.next=head;
                head=n;
            }
            else
            {
                Node y=t;
                while(t!=null && t.data<value)
                {y=t;t=t.next;}
                Node n=new Node(value);
                Node q=y.next;
                y.next=n;
                n.next=q;
            }
         while(head!=null)
         {
             System.out.print(head.data+" ");
             head=head.next;
         }
         p.next=head;
         }