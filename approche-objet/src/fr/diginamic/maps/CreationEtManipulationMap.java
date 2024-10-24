package fr.diginamic.maps;

import java.util.HashMap;

public class CreationEtManipulationMap {
    public static void main(String args[]) {
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
        
        // Ajouter Lille, Lyon et Bordeaux dans la map
        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");

        System.out.println("Clés (numéros de département) :");
        for (Integer key : mapVilles.keySet()) {
            System.out.println(key);
        }

        System.out.println("\nValeurs (noms des villes) :");
        for (String value : mapVilles.values()) {
            System.out.println(value);
        }

        System.out.println("\nTaille de la map : " + mapVilles.size());
    }
}