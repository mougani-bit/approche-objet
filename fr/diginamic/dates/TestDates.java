package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {
        // Instance de Date à la date du jour
        Date date1 = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Date du jour : " + sdf1.format(date1));

        // Instance de Date à la date du 19/05/2016 à 23:59:30
        Date date2 = new Date(116, 4, 19, 23, 59, 30);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("Date du 19/05/2016 à 23:59:30 : " + sdf2.format(date2));

        // Instance de Date à la date/heure système
        Date date3 = new Date(System.currentTimeMillis());
        System.out.println("Date/heure système : " + sdf2.format(date3));
    }
}

// Création classe TestCalendar