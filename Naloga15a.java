import java.util.Scanner;

public class Naloga15a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        boolean brk = false;

        System.out.println("Vnesi celo stevilo");
        
        while (!brk) {
            input = in.next();

            for(int i = 0; i < input.length(); i++){
                if(!(input.charAt(i) >= '0' && input.charAt(i) <= '9') || input.charAt(i) == '.'){
                    System.out.println("Vnesi celo stevilo!");
                    brk = false;
                    break;
                } 
                brk = true;
            }
        }

        in.close();
    }
}
