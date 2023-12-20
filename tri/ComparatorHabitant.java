package tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {

    @Override
    public int compare(Ville v1, Ville v2) {
        return v1.getNombreHabitants().compareTo(v2.getNombreHabitants());
    }

}