package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.Collections;

import fr.diginamic.listes.villes.Ville;

public class TestComparable {
    public static void main(String[] args) {

        ArrayList<Ville> villes = new ArrayList<>();

        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        Collections.sort(villes);

        // Affichage de la liste des villes
        for (Ville ville : villes) {
            System.out.println(ville);
        }

        // Tri par nombre d'habitants (utilisation de ComparatorHabitant)
        Collections.sort(villes, new ComparatorHabitant());
        System.out.println("Tri par nombre d'habitants (croissant) :");
        for (Ville ville : villes) {
            System.out.println(ville);
        }

        // Tri par nom de ville (utilisation de ComparatorNom)
        Collections.sort(villes, new ComparatorNom());
        System.out.println("\nTri par nom de ville (alphabétique) :");
        for (Ville ville : villes) {
            System.out.println(ville);
        }
    }
}
