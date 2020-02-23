 public static void check(Node root,HashMap<Integer,int[]>hm)
    {int x[]=hm.get(root.data);
    if(x[0]==-1)
    root.left=null;
    else if(x[0]!=-1)
    {root.left=new Node(x[0]);
    check(root.left,hm);}
    if(x[1]==-1)
    root.right=null;
    else
    {root.right=new Node(x[1]);
    check(root.right,hm);
    }
    }
    public static Node createTree(int arr[], int n)
    {
        HashMap<Integer,int[]>hm=new HashMap<>();
        for(int i=0;i<n;i++)
        hm.put(i,new int[]{-1,-1});
        int p=0;
        for(int i=0;i<n;i++)
        {if(arr[i]==-1)
        p=i;
        else
        {int x[]=hm.get(arr[i]);
        if(x[0]!=-1)
        {x[1]=i;}
        else
        {x[0]=i;}
        hm.put(arr[i],x);
        }}
        Node head=new Node(p);
        check(head,hm);
        return head;
    }