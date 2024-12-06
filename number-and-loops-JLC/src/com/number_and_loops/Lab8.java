package com.number_and_loops;

//  WAP to Find whether given Number is Prime or Not.

public class Lab8 {

	public static void main(String[] args) {

		int n = 2; 
//		int count = 0;
		
		boolean primeFlag=primeOrNot(n);
		System.out.println(primeFlag);
        /*
		 * for (int i = 2; i <= n-1; i++) {
		 * 
		 * if (n % i == 0) { count ++; break; }
		 * 
		 * }
		 * 
		 * if(count==0) { System.out.println(n + " is Prime: "); }else {
		 * System.out.println(n + " is Not Prime: "); }
		 */
		

	}

	private static boolean primeOrNot(int n) {
		
		boolean primeFlag=false;
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				primeFlag=true;
			}
		}
		
		return primeFlag;
	}

}
