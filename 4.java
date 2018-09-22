class GFG {
    static int GCD(int a, int b){
        if(a==0)return b;
        return GCD(b%a, a);
    }
    static int arrayGCD(int a[], int n){
        int result = a[0];
        for(int i=1;i<n;i++){
            result = GCD(a[i], result);
        }
        return result;
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for(int i=0;i<count;i++){
		  int size = sc.nextInt();
		  int[] a = new int[size];
		  for(int j=0;j<size;j++)
		    a[j] = sc.nextInt();
		  System.out.println(arrayGCD(a, size));
		}
	}
}

https://practice.geeksforgeeks.org/problems/gcd-of-array/0/?track=SP-Misc
