package practice;

public class PrimeNums {
    public static void main(String[] args) {

        int n1 = 1;
        int n2 = 10;

        printPrimes(n1, n2);
    }
    private static void printPrimes(int n1, int n2){

        for(int i=n1;i<=n2;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    private static boolean isPrime(int n){

        for (int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return  true;
    }
}
