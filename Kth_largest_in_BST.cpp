void print(Node *root,int k,int &a)
    {
        if(root==NULL || a>=k)
        return ;
        print(root->right,k,a);
        a++;
        if(k==a)
        cout<<root->key<<endl;
        print(root->left,k,a);
    }
void kthLargest(Node *root, int k)
{int a=0;
    print(root,k,a);
}