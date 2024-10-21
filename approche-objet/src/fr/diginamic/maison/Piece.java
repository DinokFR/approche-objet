package fr.diginamic.maison;

public abstract class Piece {

    private double superficie;
    private int numEtage;

    public int getNumEtage() {
        return numEtage;
    }
    public double getSuperficie() {
        return superficie;
    }
    public void setNumEtage(int numEtage) {
        this.numEtage = numEtage;
    }
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    Piece(double s, int numEtage){
        this.superficie = s;
        this.numEtage = numEtage;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [superficie=" + superficie + ", étage=" + numEtage + "]";
    }

}
