package com.number_and_loops;

// WAP to print the prime numbers between M to N. 

public class Lab9 {

	private static boolean isPrime(int num) {
		int count=0;
		boolean primeFlag=false;
		for(int i=2;i<=num/2;i++) {

			if(num%i==0) {
				count++;
				break;
			}
		}
		if(count==0) {

			primeFlag=true;
		}
		return primeFlag;
	}


	public static void main(String[] args) {

		int m=1;
		int n=25;

		for(int k=m;k<=n;k++) {

			if(isPrime(k)) {
				System.out.println(k);
			}


		}

	}

}
