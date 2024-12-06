package com.number_and_loops2;

//  WAP to find sum of cubes of individual digits of given number.

public class Lab20 {

	public static void main(String[] args) {

		int num=123;
		int sum=0;

		while(num!=0) {

			int dig=num%10;
			sum=sum+dig*dig*dig;
			num=num/10;

		}
		System.out.println("Sum is:"+sum);
	}


}


