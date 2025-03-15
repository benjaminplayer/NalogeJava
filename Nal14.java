import java.util.Scanner;
import java.io.File;
public class Nal14 {
    public static void main(String[] args) {
        Dijak arr[] = new Dijak[10];
        
        try {
            Scanner in = new Scanner(new File("dijaki.txt"));

            for(int i = 0; in.hasNextLine(); i++){
                String[] data = in.nextLine().split(",");
                arr[i] = new Dijak(data[0], data[1], data[2], Integer.parseInt(data[3]));
            }
            in.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        for(Dijak d : arr){
            System.out.println(d.toString());
        }
    }
}