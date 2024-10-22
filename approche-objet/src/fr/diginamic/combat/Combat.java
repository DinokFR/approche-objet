package fr.diginamic.combat;

import java.util.Random;

public class Combat {
    private Personnage personnage;
    private Creature creature;
    private static Random random = new Random();;

    public Combat(Personnage personnage, Creature creature) {
        this.personnage = personnage;
        this.creature = creature;
    }

    public static Creature genererCreatureAleatoire() {
        int type = random.nextInt(3); // Choisir entre 0 (loup), 1 (gobelin), 2 (troll)
        switch (type) {
            case 0:
                return new Creature("Loup", random.nextInt(6) + 3, random.nextInt(6) + 5);
            case 1:
                return new Creature("Gobelin", random.nextInt(6) + 5, random.nextInt(6) + 10);
            case 2:
                return new Creature("Troll", random.nextInt(6) + 10, random.nextInt(11) + 20);
            default:
                return null;
        }
    }

    public void demarrerCombat() {
        System.out.println("Combat contre " + creature.getNom() + " commence !");
        while (personnage.estVivant() && creature.estVivant()) {

            int attaquePerso = personnage.attaque();
            int attaqueCreature = creature.attaque();

            System.out.println(personnage.getNom() + " attaque avec " + attaquePerso + " points");
            System.out.println(creature.getNom() + " attaque avec " + attaqueCreature + " points");

            if (attaquePerso > attaqueCreature) {
                int degats = attaquePerso - attaqueCreature;
                System.out.println(personnage.getNom() + " inflige " + degats + " points de dégâts à " + creature.getNom());
                creature.prendreDgt(degats);
            } else if (attaqueCreature > attaquePerso) {
                int degats = attaqueCreature - attaquePerso;
                System.out.println(creature.getNom() + " inflige " + degats + " points de dégâts à " + personnage.getNom());
                personnage.prendreDgt(degats);
            }

            System.out.println("État actuel : " + personnage.getNom() + " (" + personnage.getPV() + " PV) vs " + creature.getNom() + " (" + creature.getPV() + " PV)");

            if (!personnage.estVivant()) {
                System.out.println("Votre personnage est décédé. Score: " + personnage.getScore());
                break;
            }

            if (!creature.estVivant()) {
                int points = 0;
                switch (creature.getNom()) {
                    case "Loup":
                        points = 1;
                        break;
                    case "Gobelin":
                        points = 2;
                        break;
                    case "Troll":
                        points = 5;
                        break;
                }
                personnage.ajouterScore(points);
                
                System.out.println("Victoire! Nouveau score: " + personnage.getScore());
                recompenseAleatoire();
                System.out.println();
            }
        }
    }

    private void recompenseAleatoire() {
        if (random.nextInt(2) == 0) { // 50% de chance de recevoir une récompense
            int choix = random.nextInt(4);
            switch (choix) {
                case 0:
                    int soin = random.nextInt(6) + 5;
                    personnage.prendreDgt(-soin); // Récupérer des PV
                    System.out.println("Vous avez reçu une Potion de soin (+ " + soin + " PV) !");
                    break;
                case 1:
                    System.out.println("Vous avez reçu une Potion d'attaque mineure (+3 en force pour le prochain combat) !");
                    personnage.ajouterScore(3);
                    break;
                case 2:
                    System.out.println("Vous avez reçu une Potion d'attaque majeure (+5 en force pour 2 combats) !");
                    personnage.ajouterScore(5);
                    break;
                case 3:
                    personnage.ajouterScore(5);
                    System.out.println("Bonus : +5 points de score !");
                    break;
            }
        }
    }
}
