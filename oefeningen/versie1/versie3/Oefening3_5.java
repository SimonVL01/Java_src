package oefeningen.versie1.versie3;

import java.util.*;
import java.text.DecimalFormat;

public class Oefening3_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("How many cookies do you want to bake?");

        int totalCookieServing = 48;
        DecimalFormat two = new DecimalFormat("#.###");
        int cookieAmount = s.nextInt();
        float singleSugar = 2f / totalCookieServing;
        float singleButter = 1f / totalCookieServing;
        float singleFlour = 2.75f / totalCookieServing;

        float totalSugar = singleSugar * cookieAmount;
        float totalButter = singleButter * cookieAmount;
        float totalFlour = singleFlour * cookieAmount;

        System.out.println("For making " + cookieAmount + " cookies," +
        " you need " + two.format(totalSugar) + " grams of sugar, " + two.format(totalButter) +
        " grams of butter and " + two.format(totalFlour) + " grams of flour." );
    }
}