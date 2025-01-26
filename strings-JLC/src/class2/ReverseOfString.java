package class2;
// leetcode-125
public class ReverseOfString {
    public static void main(String[] args) {

        String s = "Hello";

        String revStr=reverseString(s);
        System.out.println(revStr);

    }
    private static String reverseString(String s) {

        char chArr[] = s.toCharArray();
        int n=chArr.length;

        int start=0;
        int end=n-1;
        while(start<end){
            char temp=chArr[start];
            chArr[start]=chArr[end];
            chArr[end]=temp;
            start++;
            end--;
        }
        String revStr=new String(chArr);
        return revStr;
    }
}
