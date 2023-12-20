package entites;

/**
 * La classe TestAdressePostale permet de tester la classe AdressePostale.
 */
public class TestAdressePostale {

    /**
     * Méthode principale pour tester la classe AdressePostale.
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
