package com.number_and_loops;

// WAP to find No. of divisible's of a given Number.

public class Lab7 {

	public static void main(String[] args) {

		int n = 10; 
		int count = 0; 

		for (int i = 1; i <= n; i++) { 
			if (n % i == 0) 
				count ++; 
		} 
		System.out.println("Count : "+ count); 
	}

}
