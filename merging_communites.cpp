#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int parent(int x, vector <int> &r) {
    // we compress path here too
    if (r[x]!=x) r[x]=parent(r[x],r);
    return(r[x]);   
}

int main() {
    int n,k;
    cin >> n >> k;
    vector <int> root(n+1);
    vector <int> count(n+1);
    for (int i=1;i<=n;i++) {
        root[i]=i;
        count[i]=1;
    }    
    while (k--) {
        char t;
        cin >> t;
        
        if (t=='M') {
            int p,q;
            cin >> p >> q;   
            int x=parent(p,root);
            int y=parent(q,root);
            if (x==y)
            {continue;}
            root[x]=y;
            count[y]+=count[x];
            count[x]=0;
        }
        else if (t=='Q') {
            int p;
            cin >> p;
            cout << count[parent(p,root)] << endl;
        }
    }

    return 0;
}