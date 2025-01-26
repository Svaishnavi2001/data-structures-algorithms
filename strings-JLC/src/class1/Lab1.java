package class1;

public class Lab1 {
    public static void main(String[] args) {

        String s = "Abcdefghijk";
        int N= 4;
        s=s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            sb.append(ch);
            if((i+1)%N==0){
                sb.append("\n");
            }
        }
        String res=sb.toString();
        System.out.println(res);

    }
}
