package fr.diginamic;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        // Créer une instance de Date à la date du 19 mai 2016 à 23h59 et 30 secondes
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, 4, 19, 23, 59, 30);
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.FRANCE);
        System.out.println("Date du 19/05/2016 : " + df1.format(calendar.getTime()));

        // Créer une instance de Date à la date du jour
        Calendar calendar2 = Calendar.getInstance();
        DateFormat df2 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM);
        System.out.println("Date/heure du jour : " + df2.format(calendar2.getTime()));

        // Afficher les noms des jours et des mois en différentes langues
        System.out.println("En russe : " + calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, new Locale("ru")));
        System.out.println("En chinois : " + calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, new Locale("zh")));
        System.out.println("En allemand : " + calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.GERMAN));
    }
}

