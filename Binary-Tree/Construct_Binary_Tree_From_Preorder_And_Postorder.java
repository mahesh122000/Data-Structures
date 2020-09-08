class Solution {
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        return find(pre,0,pre.length-1,post,0,post.length-1);
    }
    TreeNode find(int a[],int prestart,int preend,int b[],int poststart,int postend)
    {
        if(prestart>preend||poststart>postend)
            return null;
        TreeNode n=new TreeNode(a[prestart]);
        if(prestart==preend)
            return n;
        int k=poststart;
        for(int i=poststart;i<=postend;i++)
        {
            if(b[i]==a[prestart+1])
            {
                k=i;
                break;
            }
        }
        n.left=find(a,prestart+1,prestart+1+k-poststart,b,poststart,k);
        n.right=find(a,prestart+2+k-poststart,preend,b,k+1,postend-1);
        return n;
    }
}