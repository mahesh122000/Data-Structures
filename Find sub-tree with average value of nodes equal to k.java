class Solution
{
    class tree
    {
        tree left;
        tree right;
        int data;
        int count;
        int sum=0;
        tree(int data)
        {this.data=data;
            left=right=null;
            count=1;
            sum=data;
        }
    }
    public tree create(Node root)
    {
        if(root==null)
        return null;
        tree node=new tree(root.data);
        node.left=create(root.left);
        node.right=create(root.right);
        return node;
    }
     public void calc(tree node)
    {
        if(node==null)
        return ;
        calc(node.left);
        calc(node.right);
        if(node.left!=null)
        {node.count+=node.left.count;
        node.sum+=node.left.sum;}
        if(node.right!=null)
        {node.count+=node.right.count;
        node.sum+=node.right.sum;}
        
    }
    public boolean find(tree node,int k)
    {
        if(node==null)
        return false;
        int t=node.sum/node.count;
        if(t*node.count==node.sum && t==k)
        return true;
        return find(node.left,k)||find(node.right,k);
    }
    public boolean Kaverage_subTree(Node root, int k)
    {
        if(root==null)
        return false;
        tree node=create(root);
        calc(node);
        return find(node,k); 
    }
}