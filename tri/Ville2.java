package tri;

public class Ville2 implements Comparable<Ville2> {
    private String nom;
    private Integer nombreHabitants;

    public Ville2(String nom, Integer nombreHabitants) {
        super();
        this.nom = nom;
        this.nombreHabitants = nombreHabitants;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getNombreHabitants() {
        return nombreHabitants;
    }

    public void setNombreHabitants(Integer nombreHabitants) {
        this.nombreHabitants = nombreHabitants;
    }

    @Override
    public String toString() {
        return nom + "," + nombreHabitants + " hab";
    }

    @Override
    public int compareTo(Ville2 ville2) {
        return this.getNombreHabitants().compareTo(ville2.getNombreHabitants());
    }

}