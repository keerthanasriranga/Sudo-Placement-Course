#include <stdio.h>

int main() {
	//code
	
	int cases;
	scanf("%d",&cases);
	
	while(cases-->0){
	    int n;
	    scanf("%d",&n);
	    int a[n], b[n];
	    for(int i=0;i<n;i++){
	        scanf("%d",&a[i]);
	    }
	    int k;
	    scanf("%d",&k);
	    for(int i=0;i<n;i++)b[(i+n-k)%n]=a[i];
	    for(int i=0;i<n;i++)
	        printf("%d ",b[i]);
	    printf("\n");
	}
}

https://practice.geeksforgeeks.org/problems/reversal-algorithm/0/?ref=self
