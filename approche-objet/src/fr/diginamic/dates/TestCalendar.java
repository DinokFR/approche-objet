package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

    public static void main(String[] args) {
        
        // 1. Utilisation de Calendar pour créer une instance de Date à la date du 19 mai 2016 à 23:59:30
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, Calendar.MAY, 19, 23, 59, 30); // Mois de mai est indexé à 4
        Date specificDate = calendar.getTime();

        // Affichage au format jour/mois/année
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Date spécifique : " + dateFormat.format(specificDate));

        // 2. Utilisation de Calendar pour créer une instance de Date à la date du jour
        Calendar todayCalendar = Calendar.getInstance(); // Date actuelle
        Date currentDate = todayCalendar.getTime();

        // Affichage de la date du jour au format année/mois/jour heure:minute:seconde
        SimpleDateFormat fullDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("Date du jour : " + fullDateFormat.format(currentDate));

        // 3. Affichage avec le nom des jours et des mois en français, russe, chinois, et allemand
        // Format pour afficher le jour et le mois avec le nom complet
        SimpleDateFormat frenchFormat = new SimpleDateFormat("EEEE d MMMM yyyy HH:mm:ss", Locale.FRENCH);
        @SuppressWarnings("deprecation")
        SimpleDateFormat russianFormat = new SimpleDateFormat("EEEE d MMMM yyyy HH:mm:ss", new Locale("ru", "RU"));
        SimpleDateFormat chineseFormat = new SimpleDateFormat("EEEE d MMMM yyyy HH:mm:ss", Locale.CHINA);
        SimpleDateFormat germanFormat = new SimpleDateFormat("EEEE d MMMM yyyy HH:mm:ss", Locale.GERMAN);

        System.out.println("En français : " + frenchFormat.format(currentDate));
        System.out.println("En russe : " + russianFormat.format(currentDate));
        System.out.println("En chinois : " + chineseFormat.format(currentDate));
        System.out.println("En allemand : " + germanFormat.format(currentDate));
    }
}
