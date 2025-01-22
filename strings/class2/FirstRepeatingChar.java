package com.class2;

public class FirstRepeatingChar {
    public static void main(String[] args) {

        String s = "programming";
        char ch=firstRepeatingChar(s);
        System.out.println(ch);
    }

    private static char firstRepeatingChar(String s) {

        int count[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            count[ch-'a']++;

            if(count[ch-97]>1){
                return ch;
            }
        }
        return '\0';
    }
}
