package fr.diginamic.banque;

public class Compte {
    private String numeroCompte;
    private double solde;

    // Constructeur
    public Compte(String numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    // Getters
    public String getNumeroCompte() {
        return numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Compte [numéro de compte=" + numeroCompte + ", solde=" + solde + "]";
    }
}
