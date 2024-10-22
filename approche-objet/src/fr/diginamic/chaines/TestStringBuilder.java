package fr.diginamic.chaines;

public class TestStringBuilder {

    public static void main(String[] args) {
 
        long d = System.currentTimeMillis();

        // Initialisation d'une instance de StringBuilder
        StringBuilder sb = new StringBuilder();

        // Ajout des nombres de 1 à 100 000
        for (int i = 1; i <= 100000; i++) {
            sb.append(i);
        }

 
        long f = System.currentTimeMillis();

        // Calcul du temps écoulé
        long duree = f - d;

        // Affichage du résultat
        System.out.println("Temps mis pour ajouter les nombres de 1 à 100 000 dans un StringBuilder : " + duree + " millisecondes");
 
        long d2 = System.currentTimeMillis();

 
        String result = "";

        // Ajout des nombres de 1 à 100 000 avec la concaténation +
        for (int i = 1; i <= 100000; i++) {
            result += i; // Concaténation avec l'opérateur +
        }

 
        long f1 = System.currentTimeMillis();

        // Calcul du temps écoulé
        long duration = f1 - d2;

        // Affichage du résultat
        System.out.println("Temps mis pour ajouter les nombres de 1 à 100 000 avec concaténation : " + duration + " millisecondes");

    }
}
