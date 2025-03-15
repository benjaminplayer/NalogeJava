import java.util.Scanner;

public class Naloga15 {
    public static void main(String[] args) {
        vnos();
    }

    public static void vnos(){
        int st = 0;
        try{
            Scanner in = new Scanner(System.in);
            System.out.println("Vnesi celo stevilo");
            st = in.nextInt();
            in.close();
        }catch(Exception e){
            System.err.println("Vnesi celo stevilo!");
            vnos();
        }
    } 

}
