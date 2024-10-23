package fr.diginamic.listes.villes;

import java.util.ArrayList;

public class TestVilles {
    public static void main(String[] args) {
        // Création de la liste de villes
        ArrayList<Ville> villes = new ArrayList<>();

        // Ajout des villes avec leur nombre d'habitants
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        // Affichage de la liste des villes
        for (Ville ville : villes) {
            System.out.println(ville);
        }

        Ville peuple = villes.getFirst();
        for (Ville ville : villes) {
            if (ville.getNbHab() > peuple.getNbHab()) {
                peuple = ville;
            }

        }
        System.out.println("La plus peuplée : " + peuple.toString());

        Ville moinpeuple = villes.getFirst();
        for (Ville ville : villes) {
            if (ville.getNbHab() < moinpeuple.getNbHab()) {
                moinpeuple = ville;
            }

        }

        villes.remove(moinpeuple);
        // Affichage de la liste des villes
        System.out.println("Affichage après suppression :");
        for (Ville ville : villes) {
            System.out.println(ville);
        }

        
        for (int i = 0; i < villes.size(); i++) {
            if (villes.get(i).getNbHab() > 100000){
            villes.get(i).setNom(villes.get(i).getNom().toUpperCase()); 
        } 
    }

            // Affichage de la liste des villes
            System.out.println("Affichage après mise en maj :");
            for (Ville ville : villes) {
                System.out.println(ville);
            }
}
}
