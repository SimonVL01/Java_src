package oefeningen.versie1.versie3;

import java.util.*;

public class Oefening3_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Geef 2 nummers op.");
        int first = s.nextInt();
        int second = s.nextInt();


        if (first > second) {
            System.out.println("The first number is larger!");
        } else if (first < second) {
            System.out.println("The second number is larger!");
        } else {
            System.out.println("They have an equal value!");
        }
    }
}