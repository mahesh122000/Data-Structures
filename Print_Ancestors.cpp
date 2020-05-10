void find(struct Node *root,int x,string c)
    {
        if(root==NULL)
        return;
        if(x==root->data)
        cout<<c;
        c=to_string(root->data)+" "+c;
        find(root->left,x,c);
        find(root->right,x,c);
    }
bool printAncestors(struct Node *root, int x)
{
    string c="";
    find(root,x,c);
    return true;
}