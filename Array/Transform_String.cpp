#include<bits/stdc++.h>
using namespace std;
int main()
 {
    int t;
    cin>>t;
    while(t--)
    {
       string s1,s2;
       cin>>s1>>s2;
       int cnt=0,i,n=s1.size();
       if(s1.size()!=s2.size())
       {
           cout<<-1<<endl;
          continue;
       }
       vector<int>a(26,0),b(26,0);
       for(i=0;i<s1.size();i++)
         a[s1[i]-97]++;
        for(i=0;i<s2.size();i++)
         b[s2[i]-97]++;
       if(a!=b)
     {  cout<<-1<<endl;
       continue;
     }
     int j=n-1;
     i=n-1;
     while(j>=0)
     {
         if(s1[j]==s2[i])
         {
             i--;
             cnt++;
         }
         j--;
     }
      cout<<n-cnt<<endl;
       
    }
	return 0;
 }