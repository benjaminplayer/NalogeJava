import java.util.ArrayList;
import java.util.Scanner;

public class Naloga18 {
    public static void main(String[] args) {
        ArrayList<String> imena = new ArrayList<>();
        ArrayList<String> zenske;
        Scanner in = new Scanner(System.in);

        System.out.println("Vnesite mosko ime: (:q to exit)");
        String ime = "";

        while(!ime.equals(":q")){
            ime = in.nextLine();
            imena.add(ime);
        }
        in.close();

        zenske = zenskafy(imena);

        int rand1 = (int)(Math.random()*(imena.size()));
        int rand2 = (int)(Math.random()*(zenske.size()));

        System.out.println(imena.get(rand1) +", "+zenske.get(rand2));

    }

    public static ArrayList<String> zenskafy(ArrayList<String> arr) {
        ArrayList<String> zenske = new ArrayList<>();
        for(int i = 0; i < arr.size(); i++){
            zenske.add(arr.get(i)+"a");
        }
        return zenske;
    }

}
