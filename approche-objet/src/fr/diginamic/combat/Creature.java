package fr.diginamic.combat; 

import java.util.Random;

public class Creature {
//creature est la classe mère de tout ce qui à une force, des pvs, etc...

    private String nom; //Je me suis permis de rajouter un nom pour le tableau des scores, en plus de ça les monstres seron différenciés par leurs noms
    protected int force;
    protected int PVmax;
    protected int PV;
    protected Random random = new Random();

    public Creature(String n){
        this.nom = n;
    }

    public Creature(String n, int f, int PV){
        this.nom = n;
        this.force = f;
        this.PVmax= PV;
        this.PV= PV;
    }

    //on calcul l'attaque de la creature
    public int attaque(){
        return this.force + random.nextInt(10 - 1 + 1) + 1;
    }


    //Méthode pour prendre des dégats 
    public void prendreDgt(int dgt){
        PV = PV - dgt;
    }

    // Redéfinition de la méthode toString pour afficher les informations de la créature
    @Override
    public String toString() {
        return "Nom: " + nom + ", Force: " + force + ", PV actuels: " + PV + "/" + PVmax;
    }

    public String getNom() {
        return nom;
    }

    public boolean estVivant() {
        return this.PV > 0;
    }

    public int getPV() {
        return PV;
    }

    public int getForce() {
        return force;
    }
    public int getPVmax() {
        return PVmax;
    }
}
