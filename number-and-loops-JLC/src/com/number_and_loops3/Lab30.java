package com.number_and_loops3;

/* WAP to print the fibonacci series. 
    0 1 1 2 3 5 8 13 */

public class Lab30 {

	public static void main(String[] args) {
		int n=5;
		int a=0;
		int b=1;
		System.out.print(a+"\t"+b);

		int nextNum=0;

		for(int i=1;i<=n-2;i++) {
			nextNum=a+b;
			System.out.print("\t"+nextNum);
			a=b;
			b=nextNum;
		}
	}

}
