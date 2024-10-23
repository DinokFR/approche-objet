package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;


public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> villes = new ArrayList<>();

        villes.add("Nice");
        villes.add("Carcassonne");
        villes.add("Narbonne");
        villes.add("Lyon");
        villes.add("Foix");
        villes.add("Pau");
        villes.add("Marseille");
        villes.add("Tarbes");

        System.out.println("Liste des villes : " + villes);


        // Rechercher et afficher le plus grand élément de la liste (En taille de chaine)
        String plusGrand = villes.getFirst();
        for (String string : villes) {
            if (plusGrand.length() < string.length()){
                plusGrand = string;
            }
        }

        System.out.println(plusGrand);

        // Mise en majuscule de tous les noms de villes
        for (int i = 0; i < villes.size(); i++) {
            villes.set(i, villes.get(i).toUpperCase());  // Met à jour chaque élément en majuscule
        }

        // Affichage de la liste des villes après modification
        System.out.println("Liste des villes après modification (majuscules) : " + villes);


        Iterator<String> iterator = villes.iterator();
        while (iterator.hasNext()) {
            String ville = iterator.next();
            if (ville.startsWith("N")) { // Vérifie si le nom commence par 'N'
                iterator.remove(); 
            }
        }

        System.out.println(villes);
    }
}
