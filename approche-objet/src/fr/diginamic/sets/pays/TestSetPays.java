package fr.diginamic.sets.pays;

import java.util.HashSet;

public class TestSetPays {

    public static void main(String[] args) {
        HashSet<Pays> paysSet = new HashSet<>();

        paysSet.add(new Pays("USA", 331002651, 67500));
        paysSet.add(new Pays("France", 65273511, 41400));
        paysSet.add(new Pays("Allemagne", 83783942, 46000));
        paysSet.add(new Pays("UK", 67886011, 42600));
        paysSet.add(new Pays("Italie", 60244639, 36000));
        paysSet.add(new Pays("Japon", 126476461, 40200));
        paysSet.add(new Pays("Chine", 1439323776, 10300));
        paysSet.add(new Pays("Russie", 145912025, 10600));
        paysSet.add(new Pays("Inde", 1380004385, 2100));

        System.out.println("Liste des pays dans le HashSet :" + paysSet.toString());

        // Recherche du pays avec le PIB par habitant le plus élevé
        Pays paysAvecPibMax = PaysAvecPibMax(paysSet);

        System.out.println("Le pays avec le PIB/habitant le plus élevé est : " + paysAvecPibMax);

        // Recherche du pays avec le PIB total le plus élevé
        Pays paysAvecPibTotalMax = PaysAvecPibTotalMax(paysSet);
        System.out.println("Le pays avec le PIB total le plus élevé est : " + paysAvecPibTotalMax);

        Pays paysMin = PaysAvecPibTotalMin(paysSet);
        paysMin.setNom(paysMin.getNom().toUpperCase());

        System.out.println("Liste des pays dans le HashSet :" + paysSet.toString());

        //On enlève le paysMin
        paysSet.remove(paysMin);

        System.out.println("Liste des pays dans le HashSet :" + paysSet.toString());
    }

    // Méthode pour rechercher le pays avec le PIB/habitant le plus élevé
    public static Pays PaysAvecPibMax(HashSet<Pays> paysSet) {
        Pays paysMax = null;

        for (Pays pays : paysSet) {
            if (paysMax == null || pays.getPibParHab() > paysMax.getPibParHab()) {
                paysMax = pays;
            }
        }

        return paysMax;
    }

    // Méthode pour rechercher le pays avec le PIB total le plus élevé
    public static Pays PaysAvecPibTotalMax(HashSet<Pays> paysSet) {
        Pays paysMax = null;
        double pibTotalMax = 0; // Initialiser le PIB total maximum

        for (Pays pays : paysSet) {
            double pibTotal = pays.getNbHabitants() * pays.getPibParHab(); // Calculer le PIB total
            if (paysMax == null || pibTotal > pibTotalMax) {
                paysMax = pays;
                pibTotalMax = pibTotal; // Mettre à jour le PIB total maximum
            }
        }

        return paysMax;
    }

    public static Pays PaysAvecPibTotalMin(HashSet<Pays> paysSet) {
        Pays paysMin = null;
        double pibTotalMin = 0; // Initialiser le PIB total minimum

        for (Pays pays : paysSet) {
            double pibTotal = pays.getNbHabitants() * pays.getPibParHab(); // Calculer le PIB total
            if (paysMin == null || pibTotal < pibTotalMin) {
                paysMin = pays;
                pibTotalMin = pibTotal; // Mettre à jour le PIB total maximum
            }
        }

        return paysMin;
    }

}
