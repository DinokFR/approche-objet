package fr.diginamic.instances;

import fr.diginamic.instances.entites.Avion;
import fr.diginamic.instances.entites.Pilote;
import java.time.LocalDate;

public class TestAvion {
    public static void main(String[] args) {
        // Créer des instances de Pilote
        Pilote pilote1 = new Pilote("Dupont", "Jean", LocalDate.of(2020, 5, 15));
        Pilote pilote2 = new Pilote("Martin", "Luc", LocalDate.of(2018, 7, 21));

        // Instancier un avion avec le premier constructeur
        Avion avion1 = new Avion("F-ABCD", "Boeing", "737");
        
        // Instancier un avion avec le second constructeur
        Avion avion2 = new Avion("F-EFGH", "Airbus", "A320", pilote2);

        // Afficher les informations des avions
        System.out.println(avion1);
        System.out.println(avion2);
    }
}
