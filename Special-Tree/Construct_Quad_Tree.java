class Solution {
    public Node construct(int[][] grid) {
        int n=grid.length;
        return find(0,0,n,grid);
    }
    public Node find(int i,int j,int n,int a[][])
    {
        if(n==1)
            return new Node(a[i][j]!=0,true);
        int m=n>>1;
        Node tl=find(i,j,m,a);
        Node tr=find(i,j+m,m,a);
        Node bl=find(i+m,j,m,a);
        Node br=find(i+m,j+m,m,a);
        if(tl.isLeaf&&tr.isLeaf&&bl.isLeaf&&br.isLeaf&&tl.val==tr.val&&tr.val==bl.val&&bl.val==br.val)
            return new Node(tl.val,true);
        return new Node(false,false,tl,tr,bl,br);
    }
}