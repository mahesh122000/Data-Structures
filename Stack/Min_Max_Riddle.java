vector<long> riddle(vector<long>arr)
{
    int n=arr.size();
    vector<long>ans(n+1);
    int l[n+1];
    int r[n+1];
    for(int i=0;i<=n;i++)
    {l[i]=-1;
    r[i]=n;}
    stack<long>st;
    for(int i=0;i<n;i++)
    {
        while(!st.empty() && arr[st.top()]>=arr[i])
        st.pop();
        
        if(!st.empty())
        l[i]=st.top();

        st.push(i);
    }
    while(!st.empty())
    {st.pop();}

    for(int i=n-1;i>=0;i--)
    {
        while(!st.empty() && arr[st.top()]>=arr[i])
        st.pop();
        
        if(!st.empty())
        r[i]=st.top();

        st.push(i);
    }
    for(int i=0;i<n;i++)
    {
        int len=r[i]-l[i]-1;
        ans[len]=max(ans[len],arr[i]);
    }
    for(int i=n-1;i>=0;i--)
    ans[i]=max(ans[i],ans[i+1]);
    return ans;
}
