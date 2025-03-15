public class Pacient {
    public String ime, priimek;
    private String krvnaSkupina;

    public Pacient(){
        ime = "NiPodatka";
        priimek = "NiPodatka";
        krvnaSkupina = "NiPodatka";
    }

    public Pacient(String ime, String priimek, String krvnaSkupina){
        this.ime = ime;
        this.priimek = priimek;
        this.krvnaSkupina = krvnaSkupina;
    }

    public String toString(){
        return "ime: "+ime+", priimek: "+priimek+", krvna skupina: "+krvnaSkupina;
    }

}
