package fr.diginamic.banque.entites;

public class Credit extends Operation {

    public Credit(String date, double montant) {
        super(date, montant);

    }

    public String getType() {
        return "Crédit";
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
