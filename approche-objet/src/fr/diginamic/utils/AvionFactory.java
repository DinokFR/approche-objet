package fr.diginamic.utils;

import java.time.LocalDate;

import fr.diginamic.instances.entites.Avion;
import fr.diginamic.instances.entites.Passager;
import fr.diginamic.instances.entites.Pilote;

public class AvionFactory {

    // Méthode static qui retourne une instance d'Avion
    public static Avion getInstance(String marque, String modele, String immatriculation, Pilote pilote, int nombrePassagers) {
        Avion avion = new Avion(immatriculation, marque, modele, pilote);
        
        // Création et ajout des passagers de manière fictive
        for (int i = 1; i <= nombrePassagers; i++) {
            avion.ajouterPassager(new Passager("Nom" + i, "Prenom" + i, i));
        }
        
        return avion;
    }

    // Méthode static transfert qui prend 2 avions en paramètres et retourne l'avion avec le plus de passagers
    public static Avion transfert(Avion avion1, Avion avion2) {
        // Si avion1 a plus de passagers que avion2
        if (avion1.getPassagers().length >= avion2.getPassagers().length) {
            // Transfert des passagers de avion2 dans avion1
            for (Passager passager : avion2.getPassagers()) {
                avion1.ajouterPassager(passager);
            }
            return avion1;
        } else {
            // Sinon, on transfère les passagers de avion1 dans avion2
            for (Passager passager : avion1.getPassagers()) {
                avion2.ajouterPassager(passager);
            }
            return avion2;
        }
    }

    public static void testAvionFactory() {
        // Création d'un pilote pour chaque avion
        Pilote pilote1 = new Pilote("Dupont", "Jean", LocalDate.of(2020, 5, 15));
        Pilote pilote2 = new Pilote("Martin", "Claire", LocalDate.of(2019, 4, 10));
            
        // Instanciation de 2 avions avec la méthode getInstance de la classe AvionFactory
        Avion avion1 = AvionFactory.getInstance("Boeing", "737", "F-ABCD", pilote1, 3);
        Avion avion2 = AvionFactory.getInstance("Airbus", "A320", "G-EFGH", pilote2, 2);
    
        // Affichage des caractéristiques de chaque avion avant le transfert
        System.out.println("Avant le transfert :");
        System.out.println(avion1);
        System.out.println(avion2);
    
        // Invoquer la méthode transfert de la classe AvionFactory
        Avion avionAvecTousPassagers = AvionFactory.transfert(avion1, avion2);
    
        // Affichage des caractéristiques des avions après le transfert
        System.out.println("\nAprès le transfert :");
    
        // Afficher l'avion 1 et l'avion 2 après transfert
        System.out.println("Avion 1 : " + avion1);
        System.out.println("Avion 2 : " + avion2);
    
        // Afficher l'avion avec tous les passagers transférés
        System.out.println("Avion avec tous les passagers : " + avionAvecTousPassagers);



    }

    public static void main(String[] args) {
        testAvionFactory();
    }
    
}

