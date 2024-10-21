package fr.diginamic.interfaces;

public class Sphere implements Objet3D{

    private double rayon;

    Sphere(double r){
        this.rayon = r;
    }

    @Override
    public double perimetre() {
        return 2*Math.PI*rayon;
    }

    @Override
    public double surface() {
        return 4*Math.PI*rayon*rayon;
    }

    @Override
    public double volume() {
        return (4/3)*Math.PI*rayon*rayon*rayon;
    }

}
