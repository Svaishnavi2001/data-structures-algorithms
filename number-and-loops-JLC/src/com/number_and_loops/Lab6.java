package com.number_and_loops;

// WAP to print the divisibles of a given Number.

public class Lab6 {

	public static void main(String[] args) {

		int n = 10; 
		for (int i = 1; i <= n; i++) { 
			if (n % i == 0) 
				System.out.println(i); 
		} 

	}

}
