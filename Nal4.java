public class Nal4 {
    private static final int SPODNJA = 10;
    private static final int ZGORNJA = 30;
    public static void main(String[] args) {

        int sum = 0;

        for(int i = SPODNJA; i < ZGORNJA; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
                sum += i;
            }
        }

        System.out.println("\nsum:"+sum);
    }

    public static boolean isPrime(int n){
        for(int i = 2; i < n-1; i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }

}
