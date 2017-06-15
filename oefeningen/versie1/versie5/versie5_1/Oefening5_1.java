package oefeningen.versie1.versie5.versie5_1;

import java.util.*;

public class Oefening5_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

            System.out.println("Geef je naam in.");
        String firstName = s.next();
        String lastName = s.next();

        System.out.println("De naam is " + firstName + " " + lastName.toUpperCase());


    }
}