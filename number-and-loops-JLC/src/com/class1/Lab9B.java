package com.number_and_loops;

// WAP to print the prime numbers between M to N. 


public class Lab9B {

	private static boolean isPrime(int num) {
			
			for(int i=2;i<=num/2;i++) {
				if(num%i==0){
					return false;
				}
			}
			        return true;
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


	


