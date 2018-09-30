

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int gcd(int a, int b){
        if(b==0)return a;
        return gcd(b, a%b);
    }
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int cases = sc.nextInt();
	    for(int i=0;i<cases;i++){
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int gcdVal = gcd(a,b);
	        System.out.print(a*b/gcdVal);
	        System.out.print(" ");
	        System.out.println(gcdVal);
	        
	        
	    }
		//code
	}
}

https://practice.geeksforgeeks.org/problems/lcm-and-gcd/0/?track=SP-Mathematics
