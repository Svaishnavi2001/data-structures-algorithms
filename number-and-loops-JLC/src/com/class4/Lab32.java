package com.class4;

/* WAP to print the following series. 
    1 1 3 8 6 27 9 64 12 125 */

public class Lab32 {
	
	public static void main(String[] args) {
		
		int n=5;
		int a=1;
		int b=1;
		
	  
		 for(int i=1;i<=n;i++) {
			 
			 System.out.print(a+"\t"+b+"\t");
			 a=3*i;
			 b=i+1;
			 b=b*b*b;
		 }
		
	}

}
