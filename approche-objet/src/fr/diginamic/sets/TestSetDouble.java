package fr.diginamic.sets;

import java.util.Collections;
import java.util.HashSet;

public class TestSetDouble {

    public static void main(String[] args) {
        // Instanciation d'un HashSet de Double
        HashSet<Double> nombres = new HashSet<>();

        // Ajout des éléments dans le HashSet
        nombres.add(1.5);
        nombres.add(8.25);
        nombres.add(-7.32);
        nombres.add(13.3);
        nombres.add(-12.45);
        nombres.add(48.5);
        nombres.add(0.01);

        System.out.println(nombres.toString());

        

        System.out.println(Collections.max(nombres));

        System.out.println("Suppression du min");
        //On enlève le min
        nombres.remove(Collections.min(nombres));

        System.out.println(nombres.toString());

    }
}
