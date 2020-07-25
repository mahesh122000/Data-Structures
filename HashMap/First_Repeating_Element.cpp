#include <bits/stdc++.h> 
using namespace std;

int main() {
	int t;
	cin>>t;
	     while(t--)
	     {
	         int n;
        cin>>n;
        int arr[n];
        unordered_map<int,int> indexMap;
        bool flag=false;
        for(int i=0;i<n;i++)
        {
            cin>>arr[i];
            indexMap[arr[i]]++;
        }
        for(int i=0;i<n;i++)
        {
            if(indexMap[arr[i]]!=1)
            {
                flag=true;
                cout<<i+1<<endl;
                break;
            }
        }
        if(flag==false)
            cout<<-1<<endl;
    }
	return 0;
}