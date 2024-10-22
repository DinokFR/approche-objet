package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class TestDates {

    public static void main(String[] args) {
        // 1. Création d'une instance de Date à la date du jour
        Date currentDate = new Date();

        // Format pour afficher jour/mois/année
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Date du jour : " + dateFormat.format(currentDate));

        // 2. Création d'une instance de Date pour le 19/05/2016 à 23:59:30
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, Calendar.MAY, 19, 23, 59, 30);
        Date specificDate = calendar.getTime();

        // Format pour afficher année/mois/jour heure:minute:seconde
        SimpleDateFormat fullDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("Date spécifique : " + fullDateFormat.format(specificDate));

        // 3. Création d'une instance de Date contenant la date/heure système
        Date systemDate = new Date();

        // Affichage de la date/heure système au même format que ci-dessus
        System.out.println("Date système : " + fullDateFormat.format(systemDate));
    }
}
