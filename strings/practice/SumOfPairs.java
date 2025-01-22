package com.practice;

public class SumOfPairs {
    public static void main(String[] args) {

        int ar[]={1,2,3,4,5,6};
        int k=4;
        for(int i=0;i<ar.length-1;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]+ar[j]==k){
                    System.out.println(ar[i]+" "+ar[j]);
                }
            }
        }
    }
}
