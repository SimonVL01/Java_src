package oefeningen.versie1;

/**
 * Created by vdabcursist on 20/06/2017.
 */
import java.util.Scanner;
import java.util.*;

public class RefVsValue {
    public static void main(String[] args) {

        boolean isOk = false;

        while (!isOk) {
        System.out.print("Geef een getal op: ");
        try {
            Scanner s = new Scanner(System.in);
            int getal = s.nextInt();
            System.out.println("Gekozen getal is " + getal);
            isOk = true;
        } catch(InputMismatchException e) {
            System.out.println("ER IS EEN FOUTE INVOER GEBEURD!");
        }
    }
        System.out.println("einde programma");
    }
}
