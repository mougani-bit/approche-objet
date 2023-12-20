package entites;

/**
 * La classe AdressePostale représente une adresse postale avec un numéro de rue,
 * un libellé de rue, un code postal et une ville.
 */
public class AdressePostale {

    /** Le numéro de la rue. */
    private int numeroRue;

    /** Le libellé de la rue. */
    private String libelleRue;

    /** Le code postal. */
    private int codePostal;

    /** La ville. */
    private String ville;

    /**
     * Constructeur de la classe AdressePostale avec tous les paramètres.
     *
     * @param numeroRue   Le numéro de la rue.
     * @param libelleRue  Le libellé de la rue.
     * @param codePostal  Le code postal.
     * @param ville       La ville.
     */
    public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    /**
     * Retourne une représentation textuelle de l'adresse postale.
     *
     * @return Une chaîne représentant l'adresse postale.
     */
    @Override
    public String toString() {
        return numeroRue + " " + libelleRue + ", " + codePostal + " " + ville;
    }

    /**
     * Méthode principale utilisée pour tester la classe AdressePostale.
     *
     * @param args Les arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {
        // Utilisation du nouveau constructeur pour créer une instance
        AdressePostale adr1 = new AdressePostale(36, "Rambla des calissons", 34070, "Montpellier");

        // Affichage de l'adresse postale
        System.out.println(adr1);
    }
}
