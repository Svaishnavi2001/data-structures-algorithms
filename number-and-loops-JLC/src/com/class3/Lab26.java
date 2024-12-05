package com.class3;

// WAP to find whether given number is armStrong or not.

public class Lab26 {

	
	public static void main(String[] args) {

		int num=371;
		int sum=0;
		int numCopy=num;

		while(num!=0) {
			int temp=num%10;
			sum=sum+cube(temp);
			num=num/10;
			
			
		}
		if(sum==numCopy) {
			System.out.println(numCopy+" is a Armstrong number");
		}
		else {

			System.out.println(numCopy+" is not an Armstrong number");
		}
	}
	
	private static int cube(int num) {

		int cube=0;
		for(int i=1;i<=num;i++) {
			cube=num*num*num;
		}
		return cube;
		// return num*num*num;
	}

}
