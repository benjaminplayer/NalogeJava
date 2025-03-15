public class Nal5 {
    public static void main(String[] args) {
        String[] arr= {"Test","Sest","Best"};
        System.out.println(toString(arr, " "));
    }

    public static String toString(String[] arr, String separator) {
        String s = "";

        for(int i = 0; i < arr.length; i++){
            s += arr[i]+separator;
        }

        return s;
    }
}
