import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Naloga16 {
    public static void main(String[] args) {
        try {
           Scanner in = new Scanner(new File("dijaki.txt"));
            System.out.println("Ta program vsebuje lovljenje izjem!");
            while(in.hasNextLine()){
                System.out.println(in.nextLine());
            }
            in.close();
        }catch(NullPointerException e){
            e.printStackTrace();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
