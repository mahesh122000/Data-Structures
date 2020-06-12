#include<bits/stdc++.h>
using namespace std;

void find(int a[],int n)
	 {
	     int l[n+1];
	     int r[n+1];
	     int ans[n+1];
	     stack<int>st;
	     for(int i=0;i<=n;i++)
	     {l[i]=-1;
	     r[i]=n;
	     ans[i]=0;}
	     for(int i=0;i<n;i++)
	     {while(!st.empty() && a[st.top()]>=a[i])
	     st.pop();
	     if(!st.empty())
	     l[i]=st.top();
	     st.push(i);
	     }
	     while(!st.empty())
	     st.pop();
	     for(int i=n-1;i>=0;i--)
	     {while(!st.empty() && a[st.top()]>=a[i])
	     st.pop();
	     if(!st.empty())
	     r[i]=st.top();
	     st.push(i);
	     }
	     
	     for(int i=0;i<n;i++)
	     {int len=r[i]-l[i]-1;
	     ans[len]=max(ans[len],a[i]);}
	     for(int i=n-1;i>=0;i--)
	     ans[i]=max(ans[i],ans[i+1]);
	     for(int i=1;i<=n;i++)
	     cout<<ans[i]<<" ";
	 }
int main() {
	    int t;
	    cin>>t;
	    while(t--)
	    {int n;
	    cin>>n;
	    int a[n];
	    for(int i = 0 ; i < n ; i++)
	    cin>>a[i]; 
	    find(a,n);
	    cout<<endl;
	    }
	return 0;
}

