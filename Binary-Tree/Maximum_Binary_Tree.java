class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return find(nums,0,nums.length-1);
    }
    TreeNode find(int a[],int i,int j)
    {
        if(i>j)
            return null;
        if(i==j)
            return new TreeNode(a[i]);
        int k=-1,val=0;
        for(int p=i;p<=j;p++)
        {
            if(a[p]>val)
            {
                val=a[p];
                k=p;
            }
        }
        TreeNode root=new TreeNode(a[k]);
        root.left=find(a,i,k-1);
        root.right=find(a,k+1,j);
        return root;
    }
}