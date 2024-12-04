package com.number_and_loops;

// WAP to print the numbers divisible by 5 between 1 and n.

public class Lab5 {

	public static void main(String[] args) {

		int n = 20; 
		for (int i = 1; i <= n; i++) { 
			if (i % 5 == 0) 
				System.out.println(i); 
		} 

	}

}
