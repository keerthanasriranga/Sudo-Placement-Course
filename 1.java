import java.util.*;
import java.lang.*;
import java.io.*;

class 1 {
    static void checkIfSquare(int n){
        int val = (int)Math.sqrt(n);
        if(val*val==n)System.out.println("1");
        else System.out.println("0");
        }
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int count=sc.nextInt();
	    for(int i=0;i<count;i++)
		checkIfSquare(sc.nextInt());
	}
}

https://practice.geeksforgeeks.org/problems/check-if-a-number-is-perfect-square/0/?track=SP-Misc
