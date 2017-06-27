package oefeningen.versie1.versie13;

import java.util.*;

public class Oefening13_2 {
    public static void main(String[] args) {

        LinkedList<Integer> Iterator = new LinkedList<>();
        for (int i = 0; i < 5_000_000; i++) {
            Iterator.add(i);

            if (i == 0 || i == 4_999_999) {
                System.out.println(System.nanoTime());
            }
        }
    }

}
