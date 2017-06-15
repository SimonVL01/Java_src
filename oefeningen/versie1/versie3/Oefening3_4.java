package oefeningen.versie1.versie3;

import java.util.*;

public class Oefening3_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("How many cookies have you eaten?");
        int cookiesEaten = s.nextInt();
        int servingCount = 10;
        int cookiesPerServing = 40 / servingCount;
        int cookieCalories = 300 / cookiesPerServing;
        int totalCalories = cookieCalories * cookiesEaten;
        System.out.println("You ate " + cookiesEaten + " cookies. " +
        "You have eaten " + totalCalories + " calories." );
    }
}