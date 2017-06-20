package oefeningen.versie1;

/**
 * Created by vdabcursist on 20/06/2017.
 */

import java.util.Scanner;

public class Integerren {
    public static void main(String[] args) {
        System.out.println("Geef een getal op.");
        Scanner s = new Scanner(System.in);
        int getal = s.nextInt();
        System.out.println("Het getal is " + getal);
    }
}
