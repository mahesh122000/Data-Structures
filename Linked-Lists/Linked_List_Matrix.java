static Node construct(int arr[][],int n)
    {
        Node head=new Node(arr[0][0]);
        Node t=head;
        Node m=head;
        for(int j=1;j<n;j++)
        {
            t.right=new Node(arr[0][j]);
            t=t.right;
        }
        for(int i=1;i<n;i++)
        {Node p=m;
        Node q=new Node(arr[i][0]);
        p.down=q;
        m=q;
        for(int j=1;j<n;j++)
        {p=p.right;
        q.right=new Node(arr[i][j]);
        q=q.right;
        p.down=q;
        }}
        return head;
    }