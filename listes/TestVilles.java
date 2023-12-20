package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestVilles {

    public static void main(String[] args) {
        ArrayList<Ville> listeVille = new ArrayList<>();
        Collections.addAll(listeVille, new Ville("Nice", 343000), new Ville("Carcassone", 47000),
                new Ville("Narbonne", 53400), new Ville("Lyon", 484000), new Ville("Foix", 9700),
                new Ville("Pau", 77200), new Ville("Marseille", 850700), new Ville("Tarbes", 40600));
        System.out.println(listeVille);

//		int maxHabitants = 0;
//		int minHabitants = Integer.MAX_VALUE;
//		int indexToRemove = -1;
//		Ville villeLaPlusPeuplee = null;
//
//		for (int i = 0; i < listeVille.size(); i++) {
//			Ville ville = listeVille.get(i);
//			if (ville.getNombreHabitants() > maxHabitants) {
//				villeLaPlusPeuplee = ville;
//				maxHabitants = ville.getNombreHabitants();
//			} else if (ville.getNombreHabitants() < minHabitants) {
//				minHabitants = ville.getNombreHabitants();
//				indexToRemove = i;
//			}
//			if (ville.getNombreHabitants() >= 100000) {
//				ville.setNom(ville.getNom().toUpperCase());
//			}
//		}
//
//		System.out.println("La ville la plus peuplée : " + villeLaPlusPeuplee.toString());
//
//		Ville villeLaMoinsPeuplee = listeVille.get(indexToRemove);
//		System.out.println(villeLaMoinsPeuplee);
//		listeVille.remove(indexToRemove);
//		System.out.println("Après supression de la ville la moins peuplée (" + villeLaMoinsPeuplee.toString()
//				+ "), la liste résultante est :");
//		for (Ville ville : listeVille) {
//			System.out.println(ville.toString());
//		}

        Ville vMin = listeVille.get(0);
        Ville vMax = listeVille.get(0);

        for (Ville v : listeVille) {
            if (v.getNombreHabitants() > vMax.getNombreHabitants()) {
                vMax = v;
            }
            if (v.getNombreHabitants() < vMin.getNombreHabitants()) {
                vMin = v;
            }
            if (v.getNombreHabitants() >= 100000) {
                String nom = v.getNom();
                v.setNom(nom.toUpperCase());
            }
        }
        System.out.println("Ville min:" + vMin);
        System.out.println("Ville max:" + vMax);

        // Suppression ville avec le moins d'habitants
        listeVille.remove(vMin);

        System.out.println("---------------------------");
        // Affichage final
        for (Ville v : listeVille) {
            System.out.println(v);
        }
    }
}