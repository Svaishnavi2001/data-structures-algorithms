package com.practice;

import org.w3c.dom.css.CSSStyleDeclaration;

public class PossiblePairsWithPrime {
    public static void main(String[] args) {

        int ar[]={1,2,3,4,5,6};
        for(int i=0;i<ar.length-1;i++){
            for(int j=i+1;j<ar.length;j++){
               if(isPrime(ar[i]) || isPrime(ar[j])){
                   System.out.println(ar[i]+" "+ar[j]);
               }
            }
        }
    }
    private static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
