package com.number_and_loops2;

// WAP to display the Armstrong numbers from 1 to n. 

public class Lab27 {

	private static int cube(int num) {

		return num*num*num;
	}
	private static boolean isArmstrong(int num) {

		int sum=0;
		int numCopy=num;
		while(num!=0) {
			int digit=num%10;
			sum=sum+cube(digit);
			num=num/10;
		}
		if(sum==numCopy) {
			return true;
		}
		else {
			return false;

		}
	}
	public static void main(String[] args) {

		int m=1;
		int n=1000;

		for(int k=m;k<=n;k++) {
			if(isArmstrong(k)) {
				System.out.println(k);
			}
		}
	}

}
