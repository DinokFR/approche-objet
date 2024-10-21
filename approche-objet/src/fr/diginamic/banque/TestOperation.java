package fr.diginamic.banque;

public class TestOperation {

    public static void main(String[] args) {
        Debit d1 = new Debit("date", 0);
        Debit d2 = new Debit("date", 31);
        Credit c1 = new Credit("date", 45);
        Credit c2 = new Credit("date", 6455);

        Operation[] ope = {d1,c1,c2,d2};
        double solde = 0;

        for (int i = 0; i != ope.length; i++) {
            System.out.println(ope[i].date);
            System.out.println(ope[i].montant);
            System.out.println(ope[i].getType());
            System.out.println();

            if(ope[i].getType().equals("Debit")){
                solde = solde - ope[i].montant;
            }
            else{
                solde = solde + ope[i].montant;
            }
        }



        System.out.println(solde);
    }

}
