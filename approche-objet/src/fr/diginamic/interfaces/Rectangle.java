package fr.diginamic.interfaces;

public class Rectangle implements ObjetGeometrique{
    private int longueur;
    private int largeur;

    Rectangle(int lo, int la){
        this.largeur = la;
        this.longueur = lo;
    }

    @Override
    public double perimetre() {
        return longueur*2 +largeur*2;
        
    }

    @Override
    public double surface() {
        return longueur*largeur;
    }

}
