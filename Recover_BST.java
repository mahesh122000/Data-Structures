class Solution {
    static ArrayList<Integer>al;
    public void recoverTree(TreeNode root) {
        al=new ArrayList<>();
        inorder(root);
        Collections.sort(al);
        build(root);
    }
    public void inorder(TreeNode root)
    {if(root==null)
     return ;
    inorder(root.left);
    al.add(root.val);
    inorder(root.right);
    }
    public void build(TreeNode root)
    {if(root==null || al.size()<=0)
     return ;
    build(root.left);
    root.val=al.get(0);
    al.remove(0);
    build(root.right);
    }
}