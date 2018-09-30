#include <iostream>
using namespace std;

int main() {
	//code
	int t;
	cin>>t;
	while(t--){
	    long long int n;
	    cin>>n;
	    (n && ((n & n-1) == 0 ))? cout<<"YES"<<endl: cout<<"NO"<<endl;
	}
	return 0;
}

https://practice.geeksforgeeks.org/problems/power-of-2/0/?ref=self
