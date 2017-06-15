package oefeningen.versie1.versie2;//Hello World + Date

import java.time.*;
import java.time.temporal.*;

public class Oefening2_ex1 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int second = now.get(ChronoField.SECOND_OF_MINUTE);
        int hour = now.get(ChronoField.HOUR_OF_DAY);
        int minute = now.get(ChronoField.MINUTE_OF_HOUR);
        int month = now.get(ChronoField.MONTH_OF_YEAR);
        int day = now.get(ChronoField.DAY_OF_MONTH);
        int year = now.get(ChronoField.YEAR);

        System.out.println("Hello, World at the date of " + day + "/" + month + "/" + year +
                " with the time of " + hour + ":" + minute + ":" + second);

    }
}