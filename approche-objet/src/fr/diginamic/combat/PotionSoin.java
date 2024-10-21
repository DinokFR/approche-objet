package fr.diginamic.combat;

import java.util.Random;

public class PotionSoin extends Objet {
    private Random random;

    public PotionSoin() {
        super("Potion de Soin");
        this.random = new Random();
    }

    // Appliquer l'effet de soin sur la créature (entre +5 et +10 points de santé)
    @Override
    public void utiliser(Creature creature) {
        int soin = random.nextInt(6) + 5; // Soin entre 5 et 10
        int nouvellePV = creature.PV + soin;
        
        // S'assurer que les PV ne dépassent pas le maximum
        if (nouvellePV > creature.PVmax) {
            nouvellePV = creature.PVmax;
        }
        creature.PV = nouvellePV;
        System.out.println(creature.getNom() + " utilise une " + nom + " et récupère " + soin + " PV. PV actuels: " + creature.PV + "/" + creature.PVmax);
    }
}

