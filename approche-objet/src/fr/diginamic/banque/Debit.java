package fr.diginamic.banque;

public class Debit extends Operation{

    @Override
    String getType() {
        return "Debit";
    }

    Debit(String date, double montant) {
        super(date, montant); 
    }

}
