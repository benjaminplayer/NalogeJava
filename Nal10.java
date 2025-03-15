public class Nal10 {
    public static void main(String[] args) {
       System.out.println(isPal("ana"));
    }

    public static boolean isPal(String s){
        if(s.length() < 2){
            return true;
        }

        if(s.charAt(0) != s.charAt(s.length()-1))
            return false;

        return isPal(s.substring(1, s.length()-1));
    }
}
