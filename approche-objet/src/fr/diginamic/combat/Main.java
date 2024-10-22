package fr.diginamic.combat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans le jeu de combat !");
        System.out.print("Entrez le nom de votre personnage: ");
        String nomPerso = scanner.nextLine();

        PotionAttaqueMajeure potionAMajeure = new PotionAttaqueMajeure();
        PotionAttaqueMineure potionAMineure = new PotionAttaqueMineure();
        PotionSoin potionSoin = new PotionSoin();

        Personnage personnage = new Personnage(nomPerso); //On initialise un premier personnage

        while (personnage.estVivant()) {
            System.out.println("Votre personnage : " + personnage.toString());
            System.out.println("\n1. Créer un nouveau personnage\n2. Combattre une créature\n3. Prendre une potion\n4. Quitter");
            int choix = scanner.nextInt();
            scanner.nextLine();
        
            if (choix ==1) {
                System.out.print("Entrez le nom de votre personnage: ");
                String nomPerso2 = scanner.nextLine();
                personnage = new Personnage(nomPerso2);
            }else if (choix == 2) {
                if (personnage.getPV() > 0) {
                    Creature creature = Combat.genererCreatureAleatoire();
                    Combat combat = new Combat(personnage, creature);
                    combat.demarrerCombat();
                } else {
                    System.out.println("Votre personnage est décédé. Score final: " + personnage.getScore());
                    break;
                }
            } else if (choix == 3){ 
                System.out.println("Choisissez une potion à prendre :");
                System.out.println("Nombre de potion de soin : " + personnage.compterPotions("Potion de Soin") + " |Nombre de potion d'attaque : " + personnage.compterPotions("Potion d'Attaque Mineure") + " |Nombre de potion d'attaque majeure " + personnage.compterPotions("Potion d'Attaque Majeure"));
                System.out.println("1. Potion de soin\n2. Potion d'attaque mineur\n3.Potion d'attaque majeur");
                int choix2 = scanner.nextInt();

                if (choix2 == 1){
                    System.out.println("Potion de soin prise");
                    potionSoin.utiliser(personnage);
                    personnage.retirerObjet("Potion de Soin");
                }else if (choix2 == 2){
                    System.out.println("Potion d'attaque mineure prise");
                    potionAMineure.utiliser(personnage);
                    personnage.retirerObjet("Potion d'Attaque Mineure");
                }else if (choix2 == 3){
                    System.out.println("Potion d'attaque majeure prise");
                    potionAMajeure.utiliser(personnage);
                    personnage.retirerObjet("potion d'attaque majeure");
                }else System.out.println("Choix invalide, retour au menu principal");

            }else if (choix == 4) {
                System.out.println("Merci d'avoir joué. Score final: " + personnage.getScore());
                break;
            } else {
                System.out.println("Choix invalide.");
            }
        }

        scanner.close();
    }
}
