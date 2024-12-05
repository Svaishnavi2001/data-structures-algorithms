package com.class4;

/*  WAP to print the following series. 
       1 1 6 4 11 9 16 16 21 25 */ 

public class Lab31 {

	public static void main(String[] args) {

		int n=5;

		int a=1;
		int b=1;

		for(int i=2;i<=(n+1);i++) {

			System.out.print(a+"\t"+b+"\t");

			a=a+5;
			b=i*i;
		}

	}

}
