package class1;

public class Lab2 {
    public static void main(String[] args) {

        String s = "WORLD";

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i%2==0){
                sb.append(String.valueOf(ch).repeat(3)).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
