package fr.diginamic.listes.villes;

public class Ville {
    private String nom;
    private int nbHab;

    public Ville(String nom, int nbHab){ 
        this.nom = nom;
        this.nbHab = nbHab;
    }
    
    public int getNbHab() {
        return nbHab;
    }
    public String getNom() {
        return nom;
    }

    public void setNbHab(int nbHab) {
        this.nbHab = nbHab;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return nom + " - " + nbHab + " habitants";
    }

}
