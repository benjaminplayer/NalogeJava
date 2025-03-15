public class Nal7 {
    public static void main(String[] args) {
        int num;
        for (int i = 0; i < 100; i++) {
            num = (int)Math.pow(i, 2) + i + 41;
            if(isPrime(num))
                System.out.println(num+" je prastevilo");
            else
                System.out.println(num+" ni prastevilo");
        }
    }

    public static boolean isPrime(int n) {
        for(int i = 2; i < n-1; i++)
            if(n % i == 0) return false;
        return true;
    }
}
