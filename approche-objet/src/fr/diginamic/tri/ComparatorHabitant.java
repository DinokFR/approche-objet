package fr.diginamic.tri;

import java.util.Comparator;

import fr.diginamic.listes.villes.Ville;

public class ComparatorHabitant implements Comparator<Ville> {

    @Override
    public int compare(Ville ville1, Ville ville2) {
        return Integer.compare(ville1.getNbHab(), ville2.getNbHab());
    }
}
