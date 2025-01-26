package practice;

public class PrintPossiblePairs {
    public static void main(String[] args) {

        int ar[]={1,2,3,4,5,6};
        for(int i=0;i<ar.length-1;i++){
            for(int j=i+1;j<ar.length;j++){
                System.out.println(ar[i]+" "+ar[j]);
            }
        }
    }
}
