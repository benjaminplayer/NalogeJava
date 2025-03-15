public class Nal8 {
    public static void main(String[] args) {
        String n = "To je prvotni niz";
        System.out.println(obrniBesede(n).toString());
    }

    public static StringBuffer obrniBesede(String s){
        String arr[] = s.split(" ");
        String s1 = "";
        StringBuffer sb;

        for(int i = 0; i < arr.length; i++){
            sb = new StringBuffer(arr[i]);
            s1 = s1 + sb.reverse()+" ";
        }
        return new StringBuffer(s1);
    }

}
