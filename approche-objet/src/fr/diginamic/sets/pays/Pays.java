package fr.diginamic.sets.pays;

import java.util.Objects;

public class Pays {
    private String nom;
    private int nbHabitants;
    private double pibParHab;

    
    public Pays(String nom, int nbHabitants, double pibParHab) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.pibParHab = pibParHab;
    }

    
    public String getNom() {
        return nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public double getPibParHab() {
        return pibParHab;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Redéfinition de equals et hashCode pour garantir l'unicité dans le HashSet
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Pays))
            return false;
        Pays pays = (Pays) o;
        return nbHabitants == pays.nbHabitants &&
                Double.compare(pays.pibParHab, pibParHab) == 0 &&
                Objects.equals(nom, pays.nom);
    }

    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", nbHabitants=" + nbHabitants +
                ", PIB/hab=" + pibParHab +
                '}';
    }
}
