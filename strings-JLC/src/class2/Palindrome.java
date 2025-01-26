package class2;

public class Palindrome {
    public static void main(String[] args) {

        String s = "yes";
        String  res=palindrome(s);
        System.out.println(res);

    }
    private static String  palindrome(String s){

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String revStr=sb.toString();

        if(s.equals(revStr)){
            return "Palindrome";
        }

        return "Not Palindrome";


    }
}
