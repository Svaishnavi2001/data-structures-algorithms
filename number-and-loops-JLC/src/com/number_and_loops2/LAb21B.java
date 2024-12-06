package com.number_and_loops2;

import java.math.BigInteger;

// WAP to find the Factorial of given Number

public class LAb21B {

	public static void main(String[] args) {

		int num=200;
		BigInteger fact=BigInteger.valueOf(1);
		for(int i=1;i<=num;i++) {

			BigInteger iVal=BigInteger.valueOf(i);

			fact=fact.multiply(iVal);
			//   fact=fact.multiply(BigInteger.valueOf(i));
		}

		System.out.println(fact);
	}

}
