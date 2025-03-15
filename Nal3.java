import java.util.Scanner;

public class Nal3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vnesi velikost tabele");
        System.out.println("i: ");
        int x = in.nextInt();
        System.out.println("j: ");
        int y = in.nextInt();
        System.out.println("Spodnja meja: ");
        int a = in.nextInt();
        System.out.println("Zgornja meja: ");
        int b = in.nextInt();
        in.close();

        int[][] arr = createArray(x, y, a, b);
        //out(arr);
        int max = max(arr);
        int avg = avg(arr);
        int diff = diff(arr, max, avg);

        System.out.println("Max: "+max+"; avg: "+avg+"; diff: "+diff);
    }

    public static int[][] createArray(int x, int y, int a, int b) {
       int[][] arr = new int[x][y];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++)
                arr[i][j] = (int)(Math.random()*(b-a)+1)+a;
        }

        return arr;
    }

    public static void out(int[][] arr){
        for(int[] i : arr){
            for(int n : i)
                System.out.print(n+" ");
            System.out.println();
        }
    }

    public static int max(int[][] arr){
        int max = arr[0][0];

        for(int[] i : arr){
            for(int n : i){
                if(n > max)
                    max = n;
            }
        }

        return max;
    }

    public static int avg(int[][] arr) {
        int sum = 0, all = 0;
        for(int[] i : arr){
            for(int n : i){
                sum +=n;
                all++;
            }
        }
        return sum / all;
    }

    public static int diff(int[][] arr, int max, int avg) {
        return max - avg;
    }

}
