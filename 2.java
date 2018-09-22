/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static void printPrime(int n){
        boolean[] prime = new boolean[n+2];
        for(int i=0;i<n+2;i++)prime[i]=true;
        for(int p=2;p*p<=n;p++){
            if(prime[p]==true){
                for(int i=p*2;i<=n;i+=p)
                    prime[i]=false;
            }
        }
        for(int i=2;i<=n;i++){
            if(prime[i]==true)
                System.out.print(i+" ");
        }
        System.out.println("");
    }
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for(int i=0;i<count;i++)
		    printPrime(sc.nextInt());
	}
}

https://practice.geeksforgeeks.org/problems/sieve-of-eratosthenes/0/?track=SP-Misc
