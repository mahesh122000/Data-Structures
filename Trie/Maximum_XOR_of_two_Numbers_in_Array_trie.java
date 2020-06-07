class Solution {
    static class Trie
    {
        Trie left=null,right=null;
    }
    public int findMaximumXOR(int[] nums) {
        Trie root=new Trie();
        for(int n:nums)
            insert(root,n);
        int ans=0;
        for(int n:nums)
            ans=Math.max(ans,xor(root,n));
        return ans;
    }
    public void insert(Trie root,int n)
    {
        int a[]=binary(n);
        for(int i=31;i>=0;i--)
        {if(a[i]==1)
            {if(root.right==null)
             root.right=new Trie();
            root=root.right;}
        if(a[i]==0)
         {if(root.left==null)
             root.left=new Trie();
            root=root.left;}
        }
    }
    public int[] binary(int n)
    {
        int a[]=new int[32];
        for(int i=0;i<32;i++)
        {a[i]=n&1;
        n=n>>1;}
        return a;
    }
    public int xor(Trie root,int n)
    {
        int v=0;
        int a[]=binary(n);
        for(int i=31;i>=0;i--)
        {
            v=v<<1;
            if(a[i]==1)
            {
                if(root.left==null)
                {v=v|1;
                root=root.right;}
                else
                root=root.left;
            }
            if(a[i]==0)
            {
                if(root.right==null)
                    root=root.left;
                else
                {v=v|1;
                root=root.right;}
            }
        }
        return v^n;
    }
}
