package com.number_and_loops;

// WAP to print the prime numbers between M to N. 

public class Lab9A {

	private static boolean isPrime(int num) {

		boolean primeFlag=true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				primeFlag=false;
				break;
			}
		}
		return primeFlag;
	}
	public static void main(String[] args) {

		int m=1;
		int n=25;
		for(int num=m;num<=n;num++) {
			if(isPrime(num)) {
				System.out.println(num);
			}
		}
	}

}
