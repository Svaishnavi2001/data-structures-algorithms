package class2;
// index of 1st Non-repeating characters of a given string

public class IndexOfFirstNonRepeatingChar {
    public static void main(String[] args) {

        String s = "programming";
        int index=indexOfFirstNonRepeatingChars(s);
        System.out.println(index);
    }

    private  static int indexOfFirstNonRepeatingChars(String  s){

        int count[]=new int[26];
         for(int i=0;i<s.length();i++){
             char ch=s.charAt(i);
             count[ch-'a']++;

             if(count[ch-97]==1){
                 return i;
             }
         }
         return 0;
    }
}
