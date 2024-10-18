package fr.diginamic.instances.entites;


public class Passager {
    private String nom;
    private String prenom;
    private int numeroSiege;  // Changement du type de String à int

    // Constructeur
    public Passager(String nom, String prenom, int numeroSiege) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroSiege = numeroSiege;
    }

    // Getters et setters pour les attributs privés
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumeroSiege() {
        return numeroSiege;
    }

    public void setNumeroSiege(int numeroSiege) {
        this.numeroSiege = numeroSiege;
    }

    @Override
    public String toString() {
        return "Passager{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numeroSiege=" + numeroSiege +
                '}';
    }
}
