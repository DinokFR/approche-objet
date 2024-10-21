package fr.diginamic.combat;

import java.util.Random;

//Une classe objet si jamais dans le futur on souhaite amener d'autres items, comme des armes 
public abstract class Objet {
    String nom;
    protected Random random;

    public abstract void utiliser(Creature creature);

    public Objet(String nom){
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

}
