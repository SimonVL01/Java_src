package oefeningen.versie1.versie5.versie5_3;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public class Oefening5_3_5verbeterd {
    private static final int MaxDepth = 7;

    public static void main(String[] args) {
        for (int d = 0; d <= MaxDepth; d++) {

            for(int s = 0; s < MaxDepth -d; s++) {
                System.out.print("\t");
            }

            for (int w = d -1; w >= d; w++) {
                printPowerOf(2, w);
            }
            System.out.println();

        }
    }

    public static void printPowerOf(int base, int exponent) {
        int val = (int) Math.pow(base, exponent);
        System.out.print(val + "\t");
    }
}
