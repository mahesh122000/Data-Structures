#include<bits/stdc++.h>
using namespace std;
vector<int> *tree;
vector<int> treedata;
vector<bool> vis;
int n,u,v,total,ans;
int dfs(int u) {
    int below = treedata[u];
    vis[u]=true;
    for(int i=0;i<tree[u].size();i++) {
        if(vis[tree[u][i]]==false)
            below += dfs(tree[u][i]);
    }
    if(abs(total - (2*below)) < ans) {
        ans = abs(total - (2*below));
    }
    return below;
}
int main() {
    cin>>n;
    tree = new vector<int>[n+1];
    treedata.resize(n+1);
    vis.resize(n+1,false);
    total = 0;
    ans = 1e9;
    for(int i=1;i<n+1;i++) {
        cin>>treedata[i];
        total += treedata[i];
    }
    for(int i=1;i<n;i++) {
        cin>>u>>v;
        tree[u].push_back(v);
        tree[v].push_back(u);
    }
    dfs(1);
    cout<<ans<<endl;
    return 0;
}