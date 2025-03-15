public class Nal6 {
    public static void main(String[] args) {
        double[][] ocene = new double[50][5];
        fill(ocene);
        najbloljeOcenjeni(ocene);
    }

    public static void najbloljeOcenjeni(double[][] ocene){
        int sc = 0;
        for(int i = 0; i < ocene.length; i++){
            for(int j = 0; j < ocene[i].length; j++){
                if(ocene[i][j] == 20){
                    System.out.println(i+1);
                    sc++;
                    break;
                }
            }
        }

        if(sc == 0)
            System.out.println("Noben skakalec ni dosegel 20 :(");
    }

    public static double[][] fill(double[][] arr) {
        double oc;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                oc = arr[i][j] = (Math.random()*21);
                if(oc > 20.0)
                    arr[i][j] = 20.0;
            }
        }
        return arr;
    }

}
