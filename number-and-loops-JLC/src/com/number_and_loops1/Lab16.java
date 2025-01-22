package com.number_and_loops1;

//  WAP to Print the digits of given number.

public class Lab16 {

	public static void main(String[] args) {

		int n=1011012;

		StringBuilder digits = new StringBuilder();
		while(n!=0){
			int temp=n%10;
			digits.insert(0,temp);
			n=n/10;
		}
		System.out.println(digits+" ");
		

	}

}
