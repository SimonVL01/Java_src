package oefeningen.versie1.versie8;

import java.util.*;

public class Oefening8_a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Geef een zin in: ");
        String sentence = s.next();
        int[] charCount = new int[26];

        for(int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            c = Character.toLowerCase(c);
            int index = c - 'A';
            charCount[index]++;

            System.out.print(c + " " + charCount);
        }


        //if(sentence.charAt(i) == 0)

        //System.out.println()
    }
}

