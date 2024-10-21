package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

    public static void main(String[] args) {
        System.out.println(Operations.calcul(10, 5, '+')); // 15.0
        System.out.println(Operations.calcul(10, 5, '-')); // 5.0
        System.out.println(Operations.calcul(10, 5, '*')); // 50.0
        System.out.println(Operations.calcul(10, 5, '/')); // 2.0
    }

}
