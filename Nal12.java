public class Nal12 {
    
    private static String dan;

    public enum vzdusje{
        PONEDELJEK,
        TOREK,
        SREDA,
        CETRTEK,
        PETEK,
        SOBOTA,
        NEDELJA
    }
    
    public static void main(String[] args) {
        new Nal12("sreda");
        vzdusje(vzdusje.valueOf(dan.toUpperCase()));
    }

    public Nal12(String dan){
        this.dan = dan;
    }


    public static void vzdusje(vzdusje v){
        switch (v) {
            case PONEDELJEK:
                System.out.println("Ponedeljki mi niso vsec");
                break;
            case TOREK:
            case SREDA:
            case CETRTEK:
            System.out.println("Med tednom je tako tako");
                break;
            case PETEK:
                break;
            case SOBOTA:
            case NEDELJA:
            System.out.println("Vikendi so mi najboljsi!");
                break;
            default:
                System.out.println("Napacen vnos");
                break;
        }
    }
}
