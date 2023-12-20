package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestTriVilleWithComparator {

    public static void main(String[] args) {
        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        System.out.println("Villes triées avec ComparatorHabitant : ");
        Collections.sort(villes, new ComparatorHabitant());
        for (Ville ville : villes) {
            System.out.println(ville.getNom());
        }
        System.out.println("Villes triées avec ComparatorNom : ");
        Collections.sort(villes, new ComparatorNom());
        for (Ville ville : villes) {
            System.out.println(ville.getNom());
        }

    }

}