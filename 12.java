import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases-->0){
    		int a  = sc.nextInt();
    		int b = sc.nextInt();
    		double ans1 = Math.log(b)/Math.log(a);
    		int ans2 = (int)ans1;
    		int res = (ans1 == ans2) ? 1 : 0;
    		System.out.println(res);
		}
	}
}

https://practice.geeksforgeeks.org/problems/check-if-a-number-is-power-of-another-number/0/?track=SP-Mathematics
