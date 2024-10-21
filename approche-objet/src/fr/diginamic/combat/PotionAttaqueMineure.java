package fr.diginamic.combat;

public class PotionAttaqueMineure extends Objet {
    public PotionAttaqueMineure() {
        super("Potion d'Attaque Mineure");
    }

    // Appliquer l'effet d'attaque mineure sur la créature (+3 en force pour le prochain combat)
    @Override
    public void utiliser(Creature creature) {
        creature.force += 3; // Ajoute 3 points à la force pour le prochain combat
        System.out.println(creature.getNom() + " utilise une " + nom + " et gagne +3 en force temporairement. Force actuelle: " + creature.force);
        // Vous devrez réinitialiser la force après le prochain combat
    }
}
