package fr.diginamic.maps;

public class Pays {
    private String nom;
    private long nbHabitants; 
    private String continent;

    public Pays(String nom, long nbHabitants, String continent) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.continent = continent;
    }

    public String getNom() {
        return nom;
    }

    public long getNbHabitants() {
        return nbHabitants;
    }

    public String getContinent() {
        return continent;
    }

    @Override
    public String toString() {
        return nom + " (" + nbHabitants + " habitants, " + continent + ")";
    }
}
