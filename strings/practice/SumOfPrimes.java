package com.practice;

public class SumOfPrimes {
    public static void main(String[] args) {
        int n=10;
        sumOfPrimes(n);
    }
    private  static void sumOfPrimes(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(isPrime(i)==true){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
    private  static boolean isPrime(int n){
        if(n==1){
            return  false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
