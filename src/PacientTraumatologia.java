public class PacientTraumatologia extends Pacient{
    private String zonaLesio;

    public PacientTraumatologia(String nom, int edat, boolean teAllergia, String zonaLesio) {
        super(nom, edat, teAllergia);
        this.zonaLesio = zonaLesio;
    }
}
