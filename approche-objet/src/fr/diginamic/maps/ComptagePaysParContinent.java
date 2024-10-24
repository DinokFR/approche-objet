package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {

    private static void compterPaysParContinent(ArrayList<Pays> listePays, HashMap<String, Integer> compteur) {
        for (Pays pays : listePays) {
            String continent = pays.getContinent();
            // Vérifie si le continent est déjà dans la map
            if (compteur.containsKey(continent)) {
                // Incrémente le compteur
                compteur.put(continent, compteur.get(continent) + 1);
            } else {
                // Ajouter le continent, compteur initial à 1
                compteur.put(continent, 1);
            }
        }
    }

    public static void main(String[] args) {
        // Création de l'ArrayList de Pays
        ArrayList<Pays> listePays = new ArrayList<>();

        // Ajout des pays à la liste
        listePays.add(new Pays("France", 65000000, "Europe"));
        listePays.add(new Pays("Allemagne", 80000000, "Europe"));
        listePays.add(new Pays("Belgique", 10000000, "Europe"));
        listePays.add(new Pays("Russie", 150000000, "Asie"));
        listePays.add(new Pays("Chine", 1400000000, "Asie"));
        listePays.add(new Pays("Indonésie", 220000000, "Océanie"));
        listePays.add(new Pays("Australie", 20000000, "Océanie"));

        // Affichage des pays
        for (Pays pays : listePays) {
            System.out.println(pays);
        }

        HashMap<String, Integer> compteurPaysParContinent = new HashMap<>();
        compterPaysParContinent(listePays, compteurPaysParContinent);

        System.out.println("\nNombre de pays par continent :");
        for (String continent : compteurPaysParContinent.keySet()) {
            System.out.println(continent + ": " + compteurPaysParContinent.get(continent) + " pays");
        }
    }
}
