class Solution {
    List<Integer>l;
    public List<Integer> flipMatchVoyage(TreeNode root, int[] a) {
        l=new ArrayList<>();
        if(find(root,a,new int[]{0}))
            return l;
        l.clear();
        l.add(-1);
        return l;
    }
    
    boolean find(TreeNode root,int a[],int i[])
    {
        if(root==null)
            return true;
        if(i[0]>=a.length)
        {
            return true;
        }
        if(root.val!=a[i[0]++])
            return false;
        if(root.left!=null && root.left.val!=a[i[0]])
        {
            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
            l.add(root.val);
        }
        if(!find(root.left,a,i))
            return false;
        if(!find(root.right,a,i))
            return false;
        return true;
    }
}