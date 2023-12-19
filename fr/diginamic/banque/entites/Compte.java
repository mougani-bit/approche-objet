package fr.diginamic.banque.entites;

/**
 * La classe Compte représente un compte bancaire avec un numéro de compte et un solde.
 */
public class Compte {

    /** Le numéro du compte. */
    private String numero;

    /** Le solde du compte. */
    private double solde;

    /**
     * Constructeur de la classe Compte avec initialisation du solde à 0.
     *
     * @param numero Le numéro du compte.
     */
    public Compte(String numero) {
        this.numero = numero;
        this.solde = 0.0;
    }

    /**
     * Constructeur de la classe Compte avec spécification du solde initial.
     *
     * @param numero Le numéro du compte.
     * @param solde  Le solde initial du compte.
     */
    public Compte(String numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    /**
     * Retourne une représentation textuelle du compte.
     *
     * @return Une chaîne représentant le compte avec son numéro et son solde.
     */
    @Override
    public String toString() {
        return "Numéro de compte=" + numero + " - solde= " + solde + " €";
    }

    /**
     * Retourne le numéro du compte.
     *
     * @return Le numéro du compte.
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Modifie le numéro du compte.
     *
     * @param numero Le nouveau numéro du compte.
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Retourne le solde du compte.
     *
     * @return Le solde du compte.
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Modifie le solde du compte.
     *
     * @param solde Le nouveau solde du compte.
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }
}
