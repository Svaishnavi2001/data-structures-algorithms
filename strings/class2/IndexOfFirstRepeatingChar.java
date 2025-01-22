package com.class2;

public class IndexOfFirstRepeatingChar {
    public static void main(String[] args) {

        String s = "programming";
        int index=indexOfFirstRepeatingChar(s);
        System.out.println(index);
    }
    private  static int indexOfFirstRepeatingChar(String  s){

        int count[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            count[ch-'a']++;

            if(count[ch-97]>1){
                return i;
            }
        }
        return  -1;
    }
}
