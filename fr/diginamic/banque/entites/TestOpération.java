package fr.diginamic.banque.entites;

class TestOperation {

    public static void main(String[] args) {
        Credit cr1 = new Credit("10 Janv 2023", 1500);
        Credit cr2 = new Credit("10 Fév 2023", 1500);

        Debit db1 = new Debit("20 Janv 2023", 550);
        Debit db2 = new Debit("23 Fév 2023", 200);

        double montant = 0.0;

        Operation[] ops = { cr1, cr2, db1, db2 };
        for (Operation op : ops) {
            // Si l'operation est un débit
            if (op.getType().equals("Débit"))
                montant -= op.getMontant(); // on soustrait le debit

                // Sinon si l'operation est un Crédit
            else if (op.getType().equals("Crédit"))
                montant += op.getMontant(); // on ajoute le credit

                // OPTIONNEL Sinon il y a une erreur car l'operation n'est pas reconu comme un
                // debit ou credit
            else
                System.err.print("Pas le bon type pour cette Operation" + op); // erreur
        }

        // affichage du solde
        System.out.println("le montant totale est de : " + montant);

    }

}