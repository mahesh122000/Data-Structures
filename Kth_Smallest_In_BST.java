int KthSmallestElement(Node *root, int k)
{   if(root==NULL)
return 0;
    if(root->lCount+1==k)
        return root->data;
    if(k<=root->lCount)
        return KthSmallestElement(root->left,k);
        return KthSmallestElement(root->right,k-(root->lCount+1));
}