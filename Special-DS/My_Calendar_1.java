class MyCalendar {
    static class node
    {
        int l;
        int r;
        node left;
        node right;
        node(int l,int r)
        {
            this.l=l;
            this.r=r;
        }
    }
    node root;
    public MyCalendar() {
        root=null;
    }
    
    public boolean book(int start, int end) {
        if(root==null)
        {
            root=new node(start,end);
            return true;
        }
        return insert(root,new node(start,end));
    }
    
    boolean insert(node root,node n)
    {
        if(root.l>=n.r)
        {
            if(root.left==null)
            {
                root.left=n;
                return true;
            }
            else
                return insert(root.left,n);
        }
        else if(root.r<=n.l)
        {
            if(root.right==null)
            {
                root.right=n;
                return true;
            }
            else
                return insert(root.right,n);
        }
        return false;
    }
}