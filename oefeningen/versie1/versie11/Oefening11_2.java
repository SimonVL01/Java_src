package oefeningen.versie1.versie11;

/**
 * Created by simon on 21/06/17.
 */

import java.util.Scanner;

public class Oefening11_2 {
    Scanner s = new Scanner(System.in);

    public Oefening11_2(int[] score) {
    }

    public void InvalidTestScore(int[] score) throws IllegalArgumentException {
        int average = (score[0] + score[1]
                + score[2]) / score.length;
        boolean error = true;

            for (int i = 0; i < score.length; i++) {
                if ((score[i] > 100) || (score[i] < 0)) {
                    error = false;
                    try {
                        throw new IllegalArgumentException("Invalid number");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Number must be between 0 and 100");
                    }
                }
            }
        if (error != false) {
            System.out.println(average);
        }

        }

    public static void main(String[] args) {
        System.out.println("Geef 3 scores in.");
        Scanner s = new Scanner(System.in);
            int[] score = {s.nextInt(), s.nextInt(), s.nextInt()};
            Oefening11_2 realscore = new Oefening11_2(score);
            realscore.InvalidTestScore(score);

        }
    }

