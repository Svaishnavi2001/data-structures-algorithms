package class2;
// leetcode-151
public class ReverseWordsOfString {
    public static void main(String[] args) {

        String s = "Welcome to Java World";

        char charArr[]=s.toCharArray();
        reverseWords(charArr);
        String revStr=new String(charArr);
        System.out.println(revStr);
    }

    private static void reverseWords(char[] charArr) {

        int n=charArr.length;
        int start=0;
        int end=0;
        while(end<n){
            if(charArr[end]==' '){
                reverseChars(charArr,start,end-1);
                start=end+1;
            }
            end++;
        }
        reverseChars(charArr,start,end-1);
        reverseChars(charArr,0,n-1);

    }

    private static void reverseChars(char[] charArr, int start,int end){

        while(start<end){
            char temp=charArr[start];
            charArr[start]=charArr[end];
            charArr[end]=temp;
            start++;
            end--;
        }
    }
}
