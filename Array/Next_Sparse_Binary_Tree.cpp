#include <iostream>
using namespace std;

int main() {
	int t;
	cin>>t;
	     while(t--)
	     {
	         long n;
	         cin>>n;
	         while(n&(n<<1))
	         n++;
	         cout<<n<<endl;
	     }
	return 0;
}