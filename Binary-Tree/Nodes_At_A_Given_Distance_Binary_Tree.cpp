vector<int> graph[10001];
    bool vis[10001];
    
    void preorder(Node *root){
        if(!root)
            return;
        if(root->left){
            graph[root->data].push_back(root->left->data);
            graph[root->left->data].push_back(root->data);
        } 
        
        if(root->right){
            graph[root->data].push_back(root->right->data);
            graph[root->right->data].push_back(root->data);
        }
        
        preorder(root->left);
        preorder(root->right);
    }
    
    
    vector <int> KDistanceNodes(Node* root, int target , int k)
    {
        // return the sorted vector of all nodes at k dist
        for(int i=0;i<10001;i++)
            graph[i].clear();
        preorder(root);
        
        memset(vis,false,sizeof(vis));
        queue<int>q;
        
        vector<int> ans;
        
        q.push(target);
        while(!q.empty() && k--){
            int len = q.size();
            while(len--){
                int v = q.front();
                vis[v] = true;
                q.pop();
                for(int u : graph[v])
                    if(vis[u] == false)
                        q.push(u);
            }
        }
        
        while(!q.empty()){
            ans.push_back(q.front());
            q.pop();
        }
        
        sort(ans.begin(), ans.end());
        return ans;
    }