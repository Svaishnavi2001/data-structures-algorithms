package com.number_and_loops3;

/* WAP to evaluate following series. 
    1/(x-1)! - x/x! + x2/(x+1)! - x3/(x+2)! + x4/(x+3)! 

 x = 1 => 1-1+1/2 => 0.5 
 x = 2 => 1-1+4/6= > 0.66  */

public class Lab36 {

	private static double power(int n,int p) {
		double power=1;
		for(int i=1;i<=p;i++) {
			power=power*n;
		}
		return power;
	}
	private static int factorial(int n) {

		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;

	}

	public static void main(String[] args) {
		int n=3;
		int x=1;
		double sum=0.0;
		int k=-1;
		int sig=1; 

		for(int i=1;i<=n;i++) {

			sum=sum+ power(x,i-1)/ factorial(x+k);
			k++;
		}

		System.out.println("sum:"+sum);
	}

}
