package fr.diginamic.instances;

import fr.diginamic.instances.entites.Pilote;
import java.time.LocalDate;

public class TestPilote {
    public static void main(String[] args) {
        // Créer 2 instances de Pilote
        Pilote pilote1 = new Pilote("Dupont", "Jean", LocalDate.of(2020, 5, 15));
        Pilote pilote2 = new Pilote("Martin", "Luc", LocalDate.of(2018, 7, 21));

        // Afficher les informations des pilotes
        System.out.println(pilote1);
        System.out.println(pilote2);
    }
}
