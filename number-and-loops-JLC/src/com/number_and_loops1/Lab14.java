package com.number_and_loops1;

//  WAP to find whether given number is perfect or not.

public class Lab14 {

	public static void main(String[] args) {

		int num=10;
		int sum=0;

		for(int i=1;i<=num;i++) {
			if(num%i==0)
				sum=sum+i;

		}
		if(sum==num) {

			System.out.println(num+" is Perfect Number");
		}
		else {

			System.out.println(num+" is not Perfect Number");
		}
	}

}
