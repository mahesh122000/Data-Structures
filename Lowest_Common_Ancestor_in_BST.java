class BST
{   
    Node LCA(Node node, int n1, int n2) 
    {
        if(node==null)
        return null;
        if(node.data<n1 && node.data<n2)
        return LCA(node.right,n1,n2);
        if(node.data>n1 && node.data>n2)
        return LCA(node.left,n1,n2);
        if((node.data>n1 && node.data<n2)||(node.data<n1 && node.data>n2))
        return node;
        if(node.data==n1 || node.data==n2)
        return node;
        return null;
    }
    
}