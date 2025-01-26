package practice;

public class PrimeOrNot {
    public  static void main(String[] args){
        int n=5;
        String res=primeCheck(n);
        System.out.println(res);
    }
    private static String  primeCheck(int n) {

        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                return "not prime";
            }
        }
        return "prime";
    }
}
