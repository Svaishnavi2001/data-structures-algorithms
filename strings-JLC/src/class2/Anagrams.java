package class2;

// Using logic

public class Anagrams {
    public static void main(String[] args) {

        String s1="abc";
        String s2="bCa";

        boolean b1=anagramCheck(s1,s2);
        System.out.println(b1);

    }
    private static boolean anagramCheck(String  s1, String s2){

        s1=s1.replaceAll("\\s","").toLowerCase();
        s2=s2.replaceAll("\\s","").toLowerCase();

        if(s1.length()!=s2.length()){
            return false;
        }
        int count[]=new int[26];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }

        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return  true;

    }
}
