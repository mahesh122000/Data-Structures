bool isCousins(Node *root, int x, int y){
queue<Node*> q;
Node *temp = nullptr;
int size, count;

q.push(root);
while(!q.empty()){
count = 0;
size = q.size();
while(size--){
temp = q.front();
q.pop();
if(temp->left && (temp->left->data == x || temp->left->data == y))
count++;
else if(temp->right && (temp->right->data == x || temp->right->data == y))
count++;
if(temp->left)
q.push(temp->left);
if(temp->right)
q.push(temp->right);
}
if(count == 2)
return true;
}
return false;
   //add code here.
}