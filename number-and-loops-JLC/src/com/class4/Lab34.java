package com.class4;

/* WAP to evaluate following series. 
    1-2/x+3/x2- 4/x3+ 5/x4-6/x5 

 x = 1 => 1-2/x+3/x2 => 1 - 2 + 3 => 2 
 x = 2 => 1-2/x+3/x2 => 1 - 1 + 3/4 => 0.75 */

public class Lab34 {

	private static double power(int n,int p) {
		double power=1;
		for(int i=1;i<=p;i++) {
			power=power*n;
		}
		return power;

	}
	public static void main(String[] args) {

		int n=3;
		int x=2;
		double sum=0.0;
		int sign=1;

		for(int i=1;i<=n;i++) {
			sum=sum+sign*(i/power(x,i-1));
			sign=sign*-1;
		}
		System.out.println("sum :"+sum);
	}
}

