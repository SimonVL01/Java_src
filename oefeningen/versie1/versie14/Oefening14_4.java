/*

package oefeningen.versie1.versie14;

import org.joda.time.DateTime;

public class Oefening14_4 {

    public static int daysOfMonth(int year, int month) {
        DateTime timing = new DateTime(year, month, 14, 12, 0);

        return timing.dayOfMonth().getMaximumValue();
    }


    public static void main(String[] args) {
        int year = 2017;
        int result = year % 4;

        for (int i = 0; i < 12; i++) {
            int amount = daysOfMonth(year, i);
            if ((result == 0) && (i == 1)) {
                amount = amount + 1;
                System.out.println(amount);
            } else {
                System.out.println(amount);
            }
        }
    }
}

*/