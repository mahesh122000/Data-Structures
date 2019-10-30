#include<iostream>
#include<deque>
using namespace std;

void maxOfSubArray(int a[], int n, int k){
    int i;
    deque<int>q;
    for(i=0; i<k; i++){
        while(!q.empty() && a[i]>=a[q.back()])
            q.pop_back();
        q.push_back(i);
    }
    cout << a[q.front()] <<' ';
    for(; i<n; i++){
        
        while(!q.empty() && q.front()<= i-k)
            q.pop_front();
        while(!q.empty() && a[i]>=a[q.back()])
            q.pop_back();
        q.push_back(i);
        cout << a[q.front()] <<' ';
    }
    cout << endl;
}

int main()
 {
    int T;
    cin >> T;
    while(T--){
	//code here Prashant
	int n, k;
	cin >> n >> k;
	int a[n];
	for(int i=0; i<n; i++){
	    cin >> a[i];
	}
	maxOfSubArray(a, n, k);
	}
	return 0;
}