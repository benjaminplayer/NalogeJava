public class Dijak {
    private String ime, priimek, predmet;
    private int ocena;

    public Dijak(String ime, String priimek, String predmet, int ocena){
        this.ime = ime;
        this.priimek = priimek;
        this.predmet = predmet;
        this.ocena = ocena;
    }

    public String vrniIme(){
        return ime;
    }

    public String vrniPriimek(){
        return priimek;
    }

    public int vrniOceno(){
        return ocena;
    }

    public String toString(){
        return "ime: "+ime+"; priimek: "+priimek+"; predmet: "+predmet+"; ocena: "+ocena;
    }

}
