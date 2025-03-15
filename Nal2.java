public class Nal2 {
    public static void main(String[] args) {
        int arr[][] = new int[10][10];
        arr = fill(arr);
        System.out.println(avg(arr));
        stSodih(arr);
    }

    public static int[][] fill(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*101) + 100;
            }
        }
        return arr;
    }

    public static double avg(int[][] arr){
        int sum = 0, all = 0;
        for(int[] i : arr){
            for(int n : i){
                sum +=n;
                all++;
            }
        }
        return sum / (double)(all);
    }

    public static void stSodih(int[][] arr){
        int count = 0;
        for(int[] a : arr){
            for(int n : a){
                if(n%2==0)
                    count++;
            }
        }

        System.out.println("Stevilo sodih: "+count);
    }

}
