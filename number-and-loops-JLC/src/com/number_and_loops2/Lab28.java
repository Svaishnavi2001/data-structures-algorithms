package com.number_and_loops2;

// WAP to print the Reverse of the given number. 

public class Lab28 {

	public static void main(String[] args) {

		int num=12345;
		int rev=0;

		while(num!=0) {

			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;

		}
		System.out.println("Reverse is:"+rev);
	}

}
