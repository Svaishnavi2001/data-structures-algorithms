package com.class3;

//  WAP to find whether given number is strong or not. 

public class Lab24 {

	private static int factorial(int num) {

		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {

		int num=123;
		int sum=0;
		int numCopy=num;

		while(num!=0) {
			int temp=num%10;
			sum=sum+factorial(temp);
			num=num/10;
		}
		if(sum==numCopy) {
			System.out.println(numCopy+" is a Strong Number");
		}
		else {
			System.out.println(numCopy+" is not a Strong Number");

		}
	}
}
