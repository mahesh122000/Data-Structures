class Solution {
    static int a;
    boolean find(Node root)
    {
        if(root==null)
        return false;
        boolean f1=find(root.left);
        boolean f2=find(root.right);
        if(f1==false && f2==false)
        {
            a++;
            return true;
        }
        return false;
    }
    public int LISS(Node node){
        a=0;
        boolean val=find(node);
        return a;
    }
}