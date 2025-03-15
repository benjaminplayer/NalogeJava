import java.util.ArrayList;

public class Naloga20 {
    public static void main(String[] args) {
        ArrayList<Sola> arr = new ArrayList<>();
        arr.add(new Sola("TSC_NG","Tigri"));
        arr.add(new Sola("Gimnazija_NG","Kanarcki"));
        arr.add(new Sola("Ekonomska_NG","Medvedi"));
        arr.add(new Sola("TSC_NG","Carovniki"));
        arr.add(new Sola("Gimnazija_Siska","RdeceSence"));

        for(Sola s: arr){
            System.out.println(s.toString());
        }

        System.out.println();
        arr.add(2, new Sola("Vegova", "Rusilci"));
        System.out.println();

        for(Sola s: arr){
            System.out.println(s.toString());
        }
        System.out.println();
        arr.remove(1);
        System.out.println();
        for(Sola s: arr){
            System.out.println(s.toString());
        }
    }
}
