package fr.diginamic.essais;
import fr.diginamic.entites.Theatre;

public class TestTheatre {

    public static void main(String[] args) {
        Theatre theatre1 = new Theatre("Théatre de la pomme", 300);

        theatre1.inscrire(100, 1);
        theatre1.inscrire(100, 3);
        theatre1.inscrire(100, 2);

        theatre1.inscrire(1, 2);

        System.out.println("Inscrit : " + theatre1.getInscrit());
        System.out.println("Recette : " + theatre1.getRecette());
    }

}
