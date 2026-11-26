import java.io.Serializable;

public abstract class Pacient implements Serializable {

    public static void Pacient(String[] args) {
        protected String nom;
        protected int edat;
        protected boolean teAllergia;
        protected double grauUrgencia;
    
    public Pacient(String nom, int edat, boolean teAllergia) {
        this.nom = nom;
        this.edat = edat;
        this.teAllergia = teAllergia;
        this.grauUrgencia = -1; // encara no s'ha fet el cribratge
    }

    // GETTERS I SETTERS
    
    /**
     * Getter que retorna @nom
     */
    public String getNom() {
        return nom; 
    }
    /**
     * Getter que retorna @edat
     */
    public int getEdat() { 
        return edat; 
    }
    /**
     * Getter que retorna @boolea segons te al·lergia o no
     */
    public boolean teAllergia() { 
        return teAllergia; 
    }
    /**
     * Getter que retorna @grau d'urgència
     */
    public double getGrauUrgencia() { 
        return grauUrgencia; 
    }
    /**
     * Setter que modifica @grau d'urgència
     */
    public void setGrauUrgencia(double grauUrgencia) { 
        this.grauUrgencia = grauUrgencia; 
    }


    }
}