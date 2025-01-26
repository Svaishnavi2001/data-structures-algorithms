package class2;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {

        String s = "programming";
        char ch=firstNonRepeatingChar(s);
        System.out.println(ch);
    }

    private static char firstNonRepeatingChar(String s) {

         int count[]=new int[26];
         for(int i=0;i<s.length();i++){
             char ch=s.charAt(i);
             count[ch-'a']++;

             if(count[ch-97]==1){
                 return ch;
             }
         }
         return '\0';
    }
}
