package fr.diginamic.banque;

public abstract class Operation {

    public String date;
    public double montant;

    abstract String getType();

    Operation(String date, double montant){
        this.date = date;
        this.montant = montant;
    }

    public String getDate() {
        return date;
    }
    public double getMontant() {
        return montant;
    }

}
