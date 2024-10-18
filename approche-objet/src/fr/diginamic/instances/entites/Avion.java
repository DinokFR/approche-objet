package fr.diginamic.instances.entites;

import java.util.Arrays;

public class Avion {
    private String immatriculation;
    private String marque;
    private String modele;
    private Pilote pilote;
    private Passager[] passagers;

    // Premier constructeur (sans Pilote ni tableau de passagers)
    public Avion(String immatriculation, String marque, String modele) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.modele = modele;
        this.pilote = null; // Pas de pilote encore
        this.passagers = new Passager[0]; // Tableau de passagers vide
    }

    // Second constructeur (sans tableau de passagers)
    public Avion(String immatriculation, String marque, String modele, Pilote pilote) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.modele = modele;
        this.pilote = pilote;
        this.passagers = new Passager[0]; // Tableau de passagers vide
    }

    // Méthode pour ajouter un passager
    public void ajouterPassager(Passager nouveauPassager) {
        // Si le tableau de passagers est plein, on l'agrandit
        if (passagers.length == 0) {
            passagers = new Passager[1]; // Crée un tableau de taille 1 si c'est vide
        } else {
            // Crée un nouveau tableau de taille supérieure et copie les passagers existants
            passagers = Arrays.copyOf(passagers, passagers.length + 1);
        }
        // Ajout du nouveau passager dans le tableau
        passagers[passagers.length - 1] = nouveauPassager;
    }

    // Getters et Setters
    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public Pilote getPilote() {
        return pilote;
    }

    public void setPilote(Pilote pilote) {
        this.pilote = pilote;
    }

    public Passager[] getPassagers() {
        return passagers;
    }

    public void setPassagers(Passager[] passagers) {
        this.passagers = passagers;
    }

    @Override
    public String toString() {
        StringBuilder passagerInfo = new StringBuilder();
        for (Passager passager : passagers) {
            passagerInfo.append(passager).append("\n");
        }
        
        return "Avion [Immatriculation=" + immatriculation + ", Marque=" + marque + 
               ", Modèle=" + modele + ", Pilote=" + pilote + 
               ", Passagers=\n" + passagerInfo + "]";
    }
}
