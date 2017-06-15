package oefeningen.versie1.versie5.versie5_4;

import java.util.*;

public class Oefening5_4_1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Pick a number between 1 and 3.");
        Random number = new Random();
        int rightNumber = number.nextInt(3) + 1;
        int lives = 2;


        int guess = s.nextInt();



            while(guess != rightNumber) {

                if(guess > 3 || guess < 1) {
                    System.out.println("The number is not between 1 and 3");
                    System.out.println("Pick a number between 1 and 3.");
                    guess = s.nextInt(); }

                else if(guess != rightNumber) {
            System.out.println("Wrong number.");
            lives--;
            guess = s.nextInt();

            }
                if(lives == 0) {
                    System.out.println("Game over!");
                }
        }
        System.out.println("You won!");
    }
}