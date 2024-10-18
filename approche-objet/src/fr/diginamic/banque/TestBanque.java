package fr.diginamic.banque;

public class TestBanque {
    public static void main(String[] args) {
        // Création d'un tableau de comptes
        Compte[] comptes = new Compte[2];
        
        // Instance d'un compte normal
        comptes[0] = new Compte("123456789", 1500.0);
        
        // Instance d'un compte rémunéré
        comptes[1] = new CompteTaux("987654321", 2000.0, 2.5);
        
        // Boucle pour afficher les informations des comptes
        for (Compte compte : comptes) {
            System.out.println(compte);
        }
    }
}
