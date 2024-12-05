package com.class3;

public class Lab26A {
	public static void main(String[] args) {

		int num=371;
		int sum=0;
		int numCopy=num;

		while(num!=0) {
			int digit=num%10;
			int cube=0;
			for(int i=1;i<=digit;i++) {
				cube=digit*digit*digit;
			}
			sum=sum+cube;
			num=num/10;
			}
		if(sum==numCopy) {
			System.out.println(numCopy+" is a Armstrong number");
		}
		else {

			System.out.println(numCopy+" is not an Armstrong number");
		}
	}
	


}
