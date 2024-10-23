package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(-1);
        liste.add(5);
        liste.add(7);
        liste.add(3);
        liste.add(-2);
        liste.add(4);
        liste.add(8);
        liste.add(5);

        System.out.println("Liste initiale : " + liste);

        System.out.println("Taille de la liste : " + liste.size());

        // Rechercher et afficher le plus grand élément de la liste
        int max = Collections.max(liste);  
        System.out.println("Le plus grand élément est : " + max);

        // Supprimer le plus petit élément de la liste
        int min = Collections.min(liste);  // Utilise Collections.min pour trouver le minimum
        liste.remove(Integer.valueOf(min));  // Utilise Integer.valueOf pour supprimer l'objet min
        System.out.println("Liste après suppression du plus petit élément (" + min + ") : " + liste);

        // Convertir les éléments négatifs en positifs
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i) < 0) {
                liste.set(i, Math.abs(liste.get(i)));  // Math.abs convertit un nombre négatif en positif
            }
        }

        // Afficher la liste finale
        System.out.println("Liste après conversion des éléments négatifs en positifs : " + liste);
    }
}
