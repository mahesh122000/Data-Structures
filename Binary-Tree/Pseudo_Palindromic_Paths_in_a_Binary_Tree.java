class Solution {
    int a[];
    int count=0;
    public int pseudoPalindromicPaths (TreeNode root) {
        a=new int[10];
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return 1;
        a[root.val]++;
        find(root.left);
        find(root.right);
        a[root.val]--;
        return count;
    }
    void find(TreeNode root)
    {
        if(root==null)
            return ;
        a[root.val]++;
        if(root.left==null && root.right==null)
        {
            int val=0;
            for(int i=1;i<10;i++)
            {
                if(a[i]%2==1)
                    val++;
            }
            if(val<=1)
                count++;
        }
        find(root.left);
        find(root.right);
        a[root.val]--;
    }
}