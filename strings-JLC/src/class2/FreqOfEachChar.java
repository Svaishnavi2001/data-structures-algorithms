package class2;

public class FreqOfEachChar {

    public static void main(String[] args) {

        String s = "dbadcabda";
        freqOfChars(s);
    }
    private static void freqOfChars(String s){

        int count[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            count[ch-'a']++;
        }
        for(int i=0;i<count.length;i++) {
            if (count[i] > 0) {
                char ch = (char) (97 + i);
                System.out.println(ch + " " + count[i]);
            }
        }
    }
}
