package oefeningen.versie1.versie8;

import java.util.*;

public class Oefening8_b {
    public static void main(String[] args) {
        int[] lijst = new int[6];
        Random rand = new Random();

        for (int i = 0; i < lijst.length; i++) {
            lijst[i] = Oefening8_b.pickUniqueNumber(lijst);
        }
        Arrays.sort(lijst);
        System.out.println(Arrays.toString(lijst));
    }

    public static int pickUniqueNumber(int[] bestaande) {
        int max = 100;

        Random r = new Random();

        int candidate = r.nextInt(max) + 1;
        while (alreadyPicked(bestaande, candidate)) {
            candidate = r.nextInt(max) + 1;
        }
        return candidate;
    }

    public static boolean alreadyPicked(int[] bestaande, int candidate) {
        for (int i = 0; i < bestaande.length; i++) {
            if(bestaande[i] != 0 && bestaande[i] == candidate) {
                    return true;
            }
        }
        return false;
    }
}