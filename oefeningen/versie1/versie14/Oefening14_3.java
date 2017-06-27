package oefeningen.versie1.versie14;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;

public class Oefening14_3 {

        public static void main(String[] args) {
            Month month = Month.valueOf("June".toUpperCase());

            System.out.println("For the month of " + month);
            LocalDate date = Year.now().atMonth(month).atDay(1).
                    with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
            Month mi = date.getMonth();
            while (mi == month) {
                System.out.println(date);
                date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
                mi = date.getMonth();
            }
        }
    }