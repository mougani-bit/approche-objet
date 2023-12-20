package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestTriVille2 {

    public static void main(String[] args) {
        List<Ville2> villes = new ArrayList<>();
        villes.add(new Ville2("Nice", 343000));
        villes.add(new Ville2("Carcassonne", 47800));
        villes.add(new Ville2("Narbonne", 53400));
        villes.add(new Ville2("Lyon", 484000));
        villes.add(new Ville2("Foix", 9700));
        villes.add(new Ville2("Pau", 77200));
        villes.add(new Ville2("Marseille", 850700));
        villes.add(new Ville2("Tarbes", 40600));

        System.out.println("Villes triées : ");
        Collections.sort(villes);
        for (Ville2 ville : villes) {
            System.out.println(ville.getNom());
        }
    }

}