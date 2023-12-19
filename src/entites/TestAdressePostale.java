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
        // Création de deux instances d'AdressePostale
        AdressePostale adr1 = new AdressePostale(36, "Rambla des calissons", 34070, "Montpellier");
        AdressePostale adr2 = new AdressePostale(22, "Avenue des Oliviers", 13000, "Marseille");

        // Affichage des adresses postales
        System.out.println("Adresse 1 : " + adr1);
        System.out.println("Adresse 2 : " + adr2);
    }
}
