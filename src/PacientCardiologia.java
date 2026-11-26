public class PacientCardiologia extends Pacient{
    private int minutsSimptomes;

    public PacientCardiologia(String nom, int edat, boolean teAllergia, int minutsSimptomes) {
        super(nom, edat, teAllergia);
        this.minutsSimptomes = minutsSimptomes;
    }
}
