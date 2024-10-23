package fr.diginamic.sets;

import java.util.HashSet;

public class TestSetString {

    public static void main(String[] args) {
        HashSet<String> pays = new HashSet<>();


        pays.add("USA");
        pays.add("France");
        pays.add("Allemagne");
        pays.add("UK");
        pays.add("Italie");
        pays.add("Japon");
        pays.add("Chine");
        pays.add("Russie");
        pays.add("Inde");

        System.out.println(pays.toString());

        String pGrand = "";

        //Recherche du plus long
        for (String string : pays) {
            if (string.length() > pGrand.length()){
                pGrand = string;
            }
        }

        System.out.println("Le plus grand est : " + pGrand);
        //On enlève le plus long
        pays.remove(pGrand);

        System.out.println(pays.toString());
    }
}