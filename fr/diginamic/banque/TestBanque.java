package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

/**
 * La classe TestBanque permet de tester les classes Compte et CompteTaux.
 */
public class TestBanque {

    /**
     * Méthode principale pour tester les classes Compte et CompteTaux.
     *
     * @param args Les arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {
        // Création d'un tableau de comptes
        Compte[] comptes = new Compte[2];

        // Création d'une instance de compte normal
        comptes[0] = new Compte("123456789", (int) 1000.0);

        // Création d'une instance de CompteTaux
        comptes[1] = new CompteTaux("987654321", (int) 2000.0, 0.05);

        // Affichage des informations des comptes avec une boucle
        for (Compte compte : comptes) {
            System.out.println(compte);
        }
    }
}
