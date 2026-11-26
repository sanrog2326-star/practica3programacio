public class PacientAltres extends Pacient{
    private String explicacio;

    public PacientAltres(String nom, int edat, boolean teAllergia, String explicacio) {
        super(nom, edat, teAllergia);
        this.explicacio = explicacio;
    }
}
