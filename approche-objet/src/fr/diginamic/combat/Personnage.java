package fr.diginamic.combat;

import java.util.ArrayList;


public class Personnage extends Creature{

    //Le personnage en plus du reste à un Score et un Inventaire

    private int score = 0;
    private ArrayList<Objet> inventaire = new ArrayList<>();
    //En soit, je fait un inventaire dans le cas ou il y as plus de type d'objet
    //Si on veut rester simple, on peut juste mettre des compteur de potion de soin et d'attaque 

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

        // Compte le nombre de potions dans l'inventaire
        public int compterPotions(String typePotion) {
            int count = 0;
            for (Objet potion : inventaire) {
                if (potion.getNom().equals(typePotion)) {
                    count++;
                }
            }
            return count;
        }

    public void ajout(Objet o){
        inventaire.add(o);
    }
    
    public boolean retirerObjet(String nomObjet) {
        for (Objet objet : inventaire) {
            if (objet.getNom().equals(nomObjet)) {
                inventaire.remove(objet);
                System.out.println(nomObjet + " a été retiré de l'inventaire.");
                return true; // Indique que l'objet a été trouvé et retiré
            }
        }
        System.out.println(nomObjet + " n'a pas été trouvé dans l'inventaire.");
        return false; // Indique que l'objet n'a pas été trouvé
    }

    public Personnage(String n, int f, int PV) {
        super(n, f, PV);
    }


    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return super.toString() + " Score: " + score;
    }

    public void ajouterScore(int points) {
        this.score += points;
    }


}
