package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Map;

import fr.diginamic.listes.villes.Ville;


public class MapVilles {

    public static void main(String[] args) {

        Map<String, Ville> mapVilles = new HashMap<>();

        // Ajout 
        mapVilles.put("Nice", new Ville("Nice", 343000));
        mapVilles.put("Carcassonne", new Ville("Carcassonne", 47800));
        mapVilles.put("Narbonne", new Ville("Narbonne", 53400));
        mapVilles.put("Lyon", new Ville("Lyon", 484000));
        mapVilles.put("Foix", new Ville("Foix", 9700));
        mapVilles.put("Pau", new Ville("Pau", 77200));
        mapVilles.put("Marseille", new Ville("Marseille", 850700));
        mapVilles.put("Tarbes", new Ville("Tarbes", 40600));


        Ville villeMin = null;

        // ville avec le moins d'habitants
        for (Ville ville : mapVilles.values()) {
            if (villeMin == null || ville.getNbHab() < villeMin.getNbHab()) {
                villeMin = ville;
            }
        }

        // Suppression 
        if (villeMin != null) {
            mapVilles.remove(villeMin.getNom());
            System.out.println("Ville supprimée : " + villeMin.getNom());
        }

        // Affichage 
        System.out.println("Villes restantes : ");
        for (Ville ville : mapVilles.values()) {
            System.out.println(ville);
        }
    }
}
