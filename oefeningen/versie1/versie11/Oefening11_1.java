package oefeningen.versie1.versie11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Oefening11_1 {

    public static void main(String[] args) {

    System.out.println("Please enter 2 figures.");
        boolean errorOk = false;

        while (!errorOk) {
            try {

                Scanner s = new Scanner(System.in);
                int sumPart1 = s.nextInt();
                int sumPart2 = s.nextInt();
                int sum = sumPart1 + sumPart2;
                System.out.println("The sum is " + sum);
                errorOk = true;

            } catch (InputMismatchException exc) {

                System.out.println("You need to enter 2 figures.");

            }
        }

    }
}
