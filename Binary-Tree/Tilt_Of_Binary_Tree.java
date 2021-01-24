class GfG{
    static int ans;
    public int tilt(Node root){
        ans=0;
        find(root);
        return ans;
    }
    int find(Node root)
    {
        if(root==null)
        return 0;
        int l=find(root.left);
        int r=find(root.right);
        ans+=Math.abs(l-r);
        return l+r+root.data;
    }
}