
    bool check(Node* root,int min,int max)
    {
      if(root!=NULL)
       {
        if(root->data<=min || root->data>=max)
           return false;
        return check(root->left,min,root->data)&check(root->right,root->data,max);
       }
    return true;
    }
	

       bool checkBST(Node* root) 
       {
       return check(root,0,99999);
       }