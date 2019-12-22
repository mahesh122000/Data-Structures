class GfG {
    public static void ans(Node root,int n,int a[])
    {
        if(root==null)
        return;
        a[n]+=root.data;
        ans(root.left,n-1,a);
        ans(root.right,n+1,a);
    }
    public static void printVertical(Node root) {
    int a[]=new int[1000];
    if(root==null)
    {return ;}
    ans(root,500,a);
    int i=0;
    while(a[i]==0)
    {i++;}
    while(a[i]!=0)
    {System.out.print(a[i]+" ");i++;}
    }
}