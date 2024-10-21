package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {

    public static void main(String[] args) { 
    Maison maison = new Maison();
    Chambre c = new Chambre(10, 0);
    WC toilette = new WC(5, 0);
    SalleDeBain salle = new SalleDeBain(15, 1);


    maison.ajouterPiece(salle);
    maison.ajouterPiece(c);

    System.out.println(maison.toString());

    maison.ajouterPiece(toilette);
    System.out.println(maison.toString());

    Chambre c2 = new Chambre(-10, 0);


    maison.ajouterPiece(c2);
    maison.ajouterPiece(null);



    System.out.println(maison.superficieTypePiece(Chambre.class));
    System.out.println(maison.nombreTypePiece(Chambre.class));
    maison.ajouterPiece(c);
    System.out.println(maison.nombreTypePiece(Chambre.class));
    }

}
