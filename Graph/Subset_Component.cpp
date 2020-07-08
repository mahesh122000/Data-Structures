#include<iostream>
#include<vector>
#define ull unsigned long long
using namespace std;
int n;
ull ans;
vector<unsigned long long> a(21);
void func(int i,vector<pair<int,unsigned long long> >graph)
    {
        if(i==n)
            return;
        func(i+1,graph);
           int total=0;
           int j=0;
           for(j=0;j<graph.size();++j)
           {
               if(graph[j].second&a[i]) //already a part
               {
                   graph[j].second=(graph[j].second)|a[i];
                   unsigned long long t=graph[j].second;
                   graph[j].first=0;
                   while(t>0)
                {
            if(t&1)
           graph[j].first++;
            t=t>>1;
        }
        break;
               }
           }
           if(j==graph.size()&&a[i])//if there is a set bit in a[i] and it isn't a part of any pre existing component.
           {

               graph.push_back(make_pair(0,a[i]));
                   unsigned long long t=a[i];
                   graph[graph.size()-1].first=0;
                   while(t>0)
                {
            if(t&1)
           graph[graph.size()-1].first++;
            t=t>>1;
        }

           }
           for(j=0;j<graph.size();++j)
            total+=graph[j].first;
           ull k=(graph.size()+(64-total));
           ans+=k;
        func(i+1,graph);
    }
int main()
{
    ios::sync_with_stdio(0);
   cin>>n;
    for(int i=0;i<n;++i)
    {
        cin>>a[i];
    }
    ans=0;
   vector<pair<int,unsigned long long> >graph;
    func(0,graph);
    if(ans)
    ans+=64;
    cout<<ans;
}