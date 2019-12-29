class GfG {
    public static Tree ans(int i,int n,int a[])
    {if(i>=n)
    return null;
    Tree root=new Tree(a[i]);
    root.left=ans(2*i+1,n,a);
    root.right=ans(2*i+2,n,a);
    return root;}
    
    public static Tree convert(Node head, Tree node) {
    int count=0;
    Node temp=head;
    while(temp!=null)
    {temp=temp.next;
    count++;}
    int a[]=new int[count];
    int j=0;
    temp=head;
    while(temp!=null)
    {a[j]=temp.data;
    temp=temp.next;
    j++;}
    node= ans(0,count,a);
    return node;
    }
}