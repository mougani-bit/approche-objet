package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

    private double tr;

    public CompteTaux(String numero, int solde, double tr) {
        super(numero, solde);
        this.tr = tr;

    }

    @Override
    public String toString() {
        return super.toString() + ", " + "CompteTaux = " + tr;
    }

}
