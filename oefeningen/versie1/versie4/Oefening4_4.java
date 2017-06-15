package oefeningen.versie1.versie4;

import java.util.*;

public class Oefening4_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Geef uw maandelijke spaarbedrag in.");

        int startValue = 0;
        double monthlyGain = s.nextInt();
        double interestPercentage = 0.05f;
        double interest = interestPercentage / 12;
        double totalSavings = 0;

        for (int i = 1; i <= 12; i++) {
           totalSavings = (totalSavings + monthlyGain) * (interest + 1);

           if (i == 6) {
               System.out.println(totalSavings);
           }
           if (i == 12) {
               System.out.println(totalSavings);
           }
        }
    }
}