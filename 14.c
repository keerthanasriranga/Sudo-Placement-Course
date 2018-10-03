#include <stdio.h>

int main() {
	//code
	int cases;
	scanf("%d",&cases);
	while(cases-->0){
	    int size;
	    scanf("%d",&size);
	    int a[size];
	    scanf("%d",&a[0]);
	    for(int i=1;i<size;i++){
	        scanf("%d",&a[i]);
	        if(a[i]<a[i-1])printf("%d ",a[i]);
	        else printf("-1 ");
	    }
	    printf("-1\n");
	}
	return 0;
}

https://practice.geeksforgeeks.org/problems/immediate-smaller-element/0/?ref=self
