package com.class2;
// WAP to find sum of cubes of numbers from 1 to n. 

public class Lab12 {

	public static void main(String[] args) {

		int n=5;
		int sum=0;
		for(int i=1;i<=n;i++) {

			sum=sum+i*i*i;
		}
		System.out.println("Sum is: "+sum);
	}

}


