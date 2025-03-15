import java.util.Scanner;

public class Nal11 {

    public enum ljubljencek{
        MACEK,
        PAPIGA,
        HRCEK,
        KACA,
        KUZA,
        TIGER
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vnesite vasega naljubsega ljubljencka");
        for (ljubljencek l: ljubljencek.values()) {
            System.out.println(l);
        }
        
        String s = in.next();
        in.close();

        switch (ljubljencek.valueOf(s.toUpperCase())) {
            case MACEK:
                System.out.println("Tvoj najljubsi je macek");
                break;
            case PAPIGA:
                System.out.println("Tvoj najljubsi je macek");
                break;
            case HRCEK:
                System.out.println("asdas");
                break;
            default:
                System.out.println("Napacen vnos");
                break;
        }

    }
}
