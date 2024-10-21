package fr.diginamic.entites;

public class Theatre {
    private String nom;
    private int capa;
    private int inscrit = 0;
    private double recette = 0;

    public Theatre(String n, int c){
        this.nom = n;
        this.capa = c;
    }

    public void inscrire(int nbclient, double prix){
        if (inscrit+nbclient > capa){
            inscrit = inscrit+nbclient;
            recette = recette+(nbclient*prix);
        }
        else{
            System.out.println("Trop de client, la salle est pleine !");
        }

    }

    public String getNom() {
        return nom;
    }
    public int getCapa() {
        return capa;
    }
    public int getInscrit() {
        return inscrit;
    }
    public double getRecette() {
        return recette;
    }

    public void setCapa(int capa) {
        this.capa = capa;
    }
    public void setInscrit(int inscrit) {
        this.inscrit = inscrit;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setRecette(double recette) {
        this.recette = recette;
    }

}
