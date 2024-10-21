package fr.diginamic.interfaces;

public class TestObjetGeometrique {

    public static void main(String[] args) {
        

        Carre carre = new Carre(5);
        Rectangle rectangle = new Rectangle(10, 6);
        Cercle cercle = new Cercle(5);
        Sphere sphere = new Sphere(8);

        ObjetGeometrique[] tab = {carre,cercle,rectangle,sphere};

        for (ObjetGeometrique tab2 : tab) {
            System.out.println("Surface : " + tab2.surface());
            System.out.println("Périmètre : " + tab2.perimetre());

            System.out.println();
        }
        Objet3D[] test = new Objet3D[3];

        test[1] = sphere;




    }

}
