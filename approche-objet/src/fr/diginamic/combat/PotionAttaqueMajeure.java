package fr.diginamic.combat;

public class PotionAttaqueMajeure extends Objet {
    private int duree; // Durée de l'effet (2 combats)

    public PotionAttaqueMajeure() {
        super("Potion d'Attaque Majeure");
        this.duree = 2; // L'effet dure 2 combats
    }

    // Appliquer l'effet d'attaque majeure sur la créature (+5 en force pour 2 combats)
    @Override
    public void utiliser(Creature creature) {
        creature.force += 5;
        System.out.println(creature.getNom() + " utilise une " + nom + " et gagne +5 en force pour les 2 prochains combats. Force actuelle: " + creature.force);
    }

    // Méthode à appeler après chaque combat pour réduire la durée de l'effet
    public void combatTermine(Creature creature) {
        duree--;
        if (duree == 0) {
            creature.force -= 5; // Réduit la force de 5 après 2 combats
            System.out.println("L'effet de la " + nom + " s'est dissipé. Force actuelle: " + creature.force);
        }
    }
}

