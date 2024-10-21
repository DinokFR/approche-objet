package fr.diginamic.operations;

public class Operations {

    public static double calcul(double a, double b, char operateur) {
        switch (operateur) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                // Vérification de division par zéro
                if (b == 0) {
                    throw new IllegalArgumentException("Division par zéro impossible.");
                }
                return a / b;
            default:
                // Si l'opérateur n'est pas valide
                throw new IllegalArgumentException("Opérateur non valide : " + operateur);
        }
    }
}
