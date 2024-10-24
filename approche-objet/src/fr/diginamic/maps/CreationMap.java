package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Map;

public class CreationMap {

    public static void main(String[] args) {
        // Créer une map pour stocker les salaires en fonction des prénoms
        Map<String, Integer> mapSalaires = new HashMap<>();

        // Ajouter les employés et leurs salaires
        mapSalaires.put("Paul", 1750);
        mapSalaires.put("Hicham", 1825);
        mapSalaires.put("Yu", 2250);
        mapSalaires.put("Ingrid", 2015);
        mapSalaires.put("Chantal", 2418);

        // Afficher la taille de la map
        System.out.println("Taille de la map : " + mapSalaires.size());
    }
}