package com.class2;

//  WAP to find sum of divisible of a given number.

public class Lab13 {

	public static void main(String[] args) {

		int n=10;
		int sum=0;

		for(int i=1;i<=n;i++) { 
			if(n%i==0) 
				sum=sum+i;
		}	

		System.out.println("Sum is:"+sum);
	}

}
