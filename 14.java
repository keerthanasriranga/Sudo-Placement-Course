import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases-->0){
		    int size = sc.nextInt();
		    int[] a = new int[size];
		    for(int i=0;i<size-1;i++){
		        int n = sc.nextInt();
		        a[n-1] = n;
		    }
		    for(int i=0;i<size;i++)
		        if(a[i]!=i+1){
		            System.out.println(i+1);
		            break;
		        }
		}
	}
}

https://practice.geeksforgeeks.org/problems/missing-number/0/?ref=self
