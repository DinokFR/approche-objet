package fr.diginamic.banque;

public class CompteTaux extends Compte {
    private double tauxRemuneration;

    // Constructeur
    public CompteTaux(String numeroCompte, double solde, double tauxRemuneration) {
        super(numeroCompte, solde);
        this.tauxRemuneration = tauxRemuneration;
    }

    // Getters
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return super.toString() + ", taux de rémunération=" + tauxRemuneration + "%]";
    }
}
