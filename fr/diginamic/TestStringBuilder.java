package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        long debut = System.currentTimeMillis();

        // Ajouter tous les nombres de 1 à 100000 dans le StringBuilder
        for (int i = 1; i <= 100000; i++) {
            sb.append(i);
        }

        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes pour utiliser StringBuilder : " + (fin - debut));

        debut = System.currentTimeMillis();

        String str = "";

        // Ajouter tous les nombres de 1 à 100000 en utilisant String et l'opérateur de concaténation "+"
        for (int i = 1; i <= 100000; i++) {
            str += i;
        }
        fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes pour utiliser String : " + (fin - debut));
    }
}
