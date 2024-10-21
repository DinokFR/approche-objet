package fr.diginamic.combat;

public class Monstre extends Creature{

    private int valeur; //La valeur en score du monstre

    public Monstre(String n, int f, int PV, int valeur) {
        super(n, f, PV);
        this.valeur = valeur;
    }
    //Le nom des monstres est loup, gobelin ou troll par exemple

    //Je me suis dit que créer une classe monstre permettrait de leurs faire des compétences
    //sous forme de méthode pour réduire la force de son ennemis ou quoi

}