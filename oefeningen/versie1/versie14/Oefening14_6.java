/*

package oefeningen.versie1.versie14;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;


public class Oefening14_6 {
    public static void main(String[] args) {
        Month month = Month.valueOf("December");

        System.out.println("For the month of " + month);
        LocalDate date = Year.of(1999).atMonth(month).atDay(13);
        LocalDate date2 = Year.of(1000).atMonth(month).atDay(13);
        while (date.isAfter(date2)) {
                date = date.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
                if (date.getDayOfWeek() == (DayOfWeek.FRIDAY));
                System.out.println(date);
            }
        }
    }

*/