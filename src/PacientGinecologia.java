public class PacientGinecologia extends Pacient{
    private boolean primerFill;
    private boolean diabetisGestacional;

    public PacientGinecologia(String nom, int edat, boolean teAllergia, boolean primerFill, boolean diabetisGestacional) {
        super(nom, edat, teAllergia);
        this.primerFill = primerFill;
        this.diabetisGestacional = diabetisGestacional;
    }
}
