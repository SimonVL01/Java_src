package oefeningen.versie1.versie14;

import org.joda.time.Days;
import org.joda.time.LocalDate;

public class Oefening14_1 {
    public static void main(String[] args) {


        // Using LocalDate object.
        LocalDate date1 = LocalDate.parse("2017-11-25");
        LocalDate date2 = LocalDate.now();
        int days = Days.daysBetween(date1, date2).getDays();
        if (days < 0) {
            days = Math.abs(days);
        }

        // Print the result.
        System.out.println("Days between " +
                date1.toString("dd-MM-yyyy") + " and " +
                date2.toString("dd-MM-yyyy") + " = " +
                days + " day(s)");

    }
}