package com.number_and_loops2;

//  WAP to find the sum of Factorials of given Number.

public class Lab22 {

	public static void main(String[] args) {
		int num=5;
		int fact=1;
		int sum=0;

		for(int i=1 ;i<=num;i++) {
			fact=fact*i;
			sum=sum+fact;
		}

		System.out.println(" Sum of Factorial is:"+sum);
	}

}
