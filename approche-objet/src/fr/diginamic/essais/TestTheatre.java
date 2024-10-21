package fr.diginamic.essais;
import fr.diginamic.entites.Theatre;

public class TestTheatre {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Théatre de la pomme", 300);

        theatre.inscrire(100, 1);
        theatre.inscrire(100, 3);
        theatre.inscrire(100, 2);
    }

}
