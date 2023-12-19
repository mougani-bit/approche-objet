package entites2;

import entites.AdressePostale;

/**
 * La classe Personne représente une personne avec un nom, un prénom et une adresse postale.
 */
public class Personne {

    /** Le nom de la personne. */
    private String nom;

    /** Le prénom de la personne. */
    private String prenom;

    /** L'adresse postale de la personne. */
    private AdressePostale adresse;

    /**
     * Constructeur de la classe Personne.
     *
     * @param nom     Le nom de la personne.
     * @param prenom  Le prénom de la personne.
     * @param adresse L'adresse postale de la personne.
     */
    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    /**
     * Retourne une représentation textuelle de la personne.
     *
     * @return Une chaîne représentant la personne avec son nom, prénom et adresse postale.
     */
    @Override
    public String toString() {
        return "Personne : " + prenom + " " + nom + "\nAdresse : " + adresse;
    }
}
