package entites;

import entites2.Personne;

/**
 * La classe TestPersonne permet de tester la classe Personne.
 */
public class TestPersonne {

    /**
     * Méthode principale pour tester la classe Personne.
     *
     * @param args Les arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {
        // Création de deux adresses postales
        AdressePostale adresse1 = new AdressePostale(36, "Rambla des calissons", 34070, "Montpellier");
        AdressePostale adresse2 = new AdressePostale(22, "Avenue des Oliviers", 13000, "Marseille");

        // Création de deux personnes avec des adresses différentes
        Personne personne1 = new Personne("Mougani", "Christ", adresse1);
        Personne personne2 = new Personne("Biansoumba", "Divine", adresse2);

        // Affichage des informations des personnes
        System.out.println(personne1);
        System.out.println("-------------------------");
        System.out.println(personne2);
    }
}
