import java.util.Scanner;

public class Naloga13 {
    public static void main(String[] args) {
        Dijak[] arr = new Dijak[5];
        String ime, priimek, predmet;
        int ocena;


        Scanner in = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++){
            System.out.println("Vnesi ime");
            ime = in.nextLine();
            System.out.println("Vnesi priimek");
            priimek = in.nextLine();
            System.out.println("Vnesi predmet");
            predmet = in.nextLine();
            System.out.println("Vnesi oceno");
            ocena = in.nextInt();
            arr[i] = new Dijak(ime, priimek, predmet, ocena);
            in.nextLine();
        }
        in.close();

        System.out.println(povprecnaOcena(arr));

    }

    public static double povprecnaOcena(Dijak[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i].vrniOceno();
        }

        return (double)sum/arr.length;
    }

}
