void dfs(list<int>adj[],vector<bool>&vis,int s)
{
    vis[s]=true;
    for(auto u:adj[s])
    {
        if(vis[u]==false)
        dfs(adj,vis,u);
    }
}
bool isBridge(list<int> adj[], int V, int s, int e) {
    adj[s].remove(e);
    adj[e].remove(s);
    vector<bool>vis(V,false);
    dfs(adj,vis,s);
    if(vis[e]==false)
    return true;
    return false;
}