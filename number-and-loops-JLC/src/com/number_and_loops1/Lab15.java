package com.number_and_loops1;

// WAP to display the perfect numbers from m to n.

public class Lab15 {

	private static boolean isPerfect(int num) {

		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) 
				sum=sum+i;

		}
		if(sum==num)
			return true;
		else
			return false;

	}
	public static void main(String[] args){

		int m=1;
		int n=50;
		for(int k=m;k<=n;k++) {
			if(isPerfect(k)) {
				System.out.println(k);
			}
		}
	}	 

} 




