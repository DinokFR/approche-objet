package fr.diginamic.banque;

public class Credit extends Operation{

    @Override
    String getType() {
        return "Credit";
    }

    Credit(String date, double montant) {
        super(date, montant);
    }

}
