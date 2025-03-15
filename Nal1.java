import java.util.Scanner;

public class Nal1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        zv1(n);
        System.out.println();
        System.out.println();
        zv2(n);
    }

    public static void zv1(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int i, j;

        i = n;
        while(i > 0){
            j = 0;
            while(j < i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }

        i=n;

        do {
            if(n == 0) break;

            j = 0;

            do {
                System.out.print("*");
                j++;
            } while (j < i);
            System.out.println();
            i--;
        } while (i > 0);

    }

    public static void zv2(int n){
        int zv = n;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++)
                System.out.print(" ");
            
            for(int j = zv; j > 0; j--){
                System.out.print("*");
            }
            zv--;
            System.out.println();
        }


        System.out.println();
        System.out.println();

        zv = n;
        int i = 0, j;
        
        while (i < n) {
            j = 0;
            while(j < i){
                System.out.print(" ");
                j++;
            }

            j = zv;
            while (j > 0) {
                System.out.print("*");
                j--;
            }
            zv--;
            System.out.println();
            i++;
        }

        zv = n;
        i = 0;
        
        do{

            if(n == 0)
                break;

            j = 0;
            do {
                if(i == 0) break;
                System.out.print(" ");
                j++;
            } while(j < i);

            j = zv;

            do {
                System.out.print("*");
                j--;
            } while (j > 0);

            zv--;
            System.out.println();
            i++;

        }while (i < n);

    }

}