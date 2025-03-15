import java.io.FileReader;
import java.util.Scanner;

public class Nal9 {
    public static void main(String[] args) {
        String[] arr = createArrayFromFile("in.txt");
        System.out.println(arr[0].toUpperCase().charAt(arr[0].length()-1) +"."+arr[arr.length-1].toUpperCase().charAt(arr[arr.length-1].length()-1));
    }

    public static String[] createArrayFromFile(String filename) {
        String[] arr = new String[getLength(filename)];

        int i = 0;

        try{
            Scanner in = new Scanner(new FileReader(filename));
            while(in.hasNextLine()){
                arr[i] = in.nextLine();
                System.out.println(arr[i]);
                i++;
            }
            in.close();

        }catch(Exception e){
            e.printStackTrace();
        }

        return arr;
    }

    public static int getLength(String filename){
        int length = 0;
        System.out.println("here");
        try{
            Scanner in = new Scanner(new FileReader(filename));
            while(in.hasNextLine()){
                length++;
                in.nextLine();
            }
                
            
            in.close();
        }catch(Exception e){
            e.printStackTrace();
        }

        return length;
    }

}
