package oefeningen.versie1.versie3;

import java.util.*;

public class Oefening3_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Geef 3 nummers in.");
        int first = s.nextInt();
        int second = s.nextInt();
        int third = s.nextInt();

        int sumTotal = first + second + third;
        int average = (first + second + third) / 3;
        long product = first * second * third;
        int largest = 0;
        int smallest = 0;

        if (first > second && first > third) {
            largest = first;
        } else if (first < second && second > third) {
            largest = second;
        } else if (first < third && second < third) {
            largest = third;
        } else {
            largest = 0;
        }

        if (first < second && first < third) {
            smallest = first;
        } else if (first > second && second < third) {
            smallest = second;
        } else if (first > third && second > third) {
            smallest = third;
        } else {
            smallest = 0;
        }

        System.out.println("The sum of " + first + ", " + second + " and " + third + " equals " + sumTotal);
        System.out.println("The average of " + first + ", " + second + " and " + third + " equals " + average);
        System.out.println("The product of " + first + ", " + second + " and " + third + " equals " + product);
        System.out.println("The largest number of " + first + ", " + second + " and " + third + " is " + largest);
        System.out.println("The smallest number of " + first + ", " + second + " and " + third + " is " + smallest);
    }
}