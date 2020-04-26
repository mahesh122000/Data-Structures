 public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer>al=new ArrayList<>();
        while(head!=null)
        {al.add(head.val);
        head=head.next;}
        int n=al.size();
        int i=0;
        return find(al,i,n-1);
    }
    public TreeNode find(ArrayList<Integer>al,int i,int j)
    {
        if(i<0 || i>j)
            return null;
        int m=(i+j)>>1;
        TreeNode root=new TreeNode(al.get(m));
        root.left=find(al,i,m-1);
        root.right=find(al,m+1,j);
        return root;
    }