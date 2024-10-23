package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {
    public static void main(String args[]) {
        List<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");
        List<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");



        //Version 1 (avant que je finisse de lire la question et que je me rende compte qu'il faut utiliser des bouvles....)
        List<String> liste3 = new ArrayList<String>();
        liste3.addAll(liste1);
        liste3.addAll(liste2);

        //version 2

        List<String> liste4 = new ArrayList<String>();

        for (String string : liste1) {
            liste4.add(string);
        }

        for (String string : liste2) {
            liste4.add(string);
        }
        System.out.println(liste4.toString());

    }
}