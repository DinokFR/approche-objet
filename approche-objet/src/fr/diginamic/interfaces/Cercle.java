package fr.diginamic.interfaces;

public class Cercle implements ObjetGeometrique{

    private double rayon;

    public Cercle(double r){
        this.rayon = r;
    }

    @Override
    public double perimetre() {
        return 2*Math.PI*rayon;
    }

    @Override
    public double surface() {
        return Math.PI*rayon*rayon;
    }

}
