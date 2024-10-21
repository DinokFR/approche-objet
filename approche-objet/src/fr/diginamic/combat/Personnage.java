package fr.diginamic.combat;

import java.util.ArrayList;


public class Personnage extends Creature{

    //Le personnage en plus du reste à un Score et un Inventaire

    private int score = 0;
    private ArrayList<Objet> inventaire = new ArrayList<>();


    public Personnage(String n){ //On met la force et le pv de façon aléatoire
        super(n);
        this.force = random.nextInt(18 - 12 + 1) + 12;
        int pv = random.nextInt(50 - 20 + 1) + 20; 
        this.PVmax = pv;
        this.PV = pv;

        PotionAttaqueMajeure potionAMajeure = new PotionAttaqueMajeure();
        PotionAttaqueMineure potionAMineure = new PotionAttaqueMineure();
        PotionSoin potionSoin = new PotionSoin();
        ajout(potionSoin);
        ajout(potionAMineure);
        ajout(potionAMajeure);

    }

    public void ajout(Objet o){
        inventaire.add(o);
    }
    
    public void retirer(Objet o){
        inventaire.remove(o);
    }

    public Personnage(String n, int f, int PV) {
        super(n, f, PV);
    }


    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
