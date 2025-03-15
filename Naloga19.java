import java.util.Scanner;

public class Naloga19 {
    public static void main(String[] args) {
        Pacient arr[] = new Pacient[30];
        Scanner in = new Scanner(System.in);

        String ime, priimek, krvnaSkupina;

        for(int i = 0; i < arr.length; i++){
            System.out.println("Vnesi ime");
            ime = in.nextLine();
            System.out.println("Vnesi priimek");
            priimek = in.nextLine();
            System.out.println("Vnesi krvno skupino");
            krvnaSkupina = in.nextLine();
            arr[i] = new Pacient(ime, priimek, krvnaSkupina);
        }
        in.close();
    }
}
