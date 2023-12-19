package tri;

public class Ville {
    private String nom;
    private int nbHabs;

    public Ville(String nom, int nbHabs) {
        this.nom = nom;
        this.nbHabs = nbHabs;
    }

    @Override
    public String toString() {
        return "nom=" + nom +
                ", nbHabs=" + nbHabs;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabs() {
        return nbHabs;
    }

    public void setNbHabs(int nbHabs) {
        this.nbHabs = nbHabs;
    }
}
