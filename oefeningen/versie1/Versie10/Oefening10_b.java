package oefeningen.versie1.Versie10;

/**
 * Created by simon on 21/06/17.
 */

public class Oefening10_b {
    public static void main(String[] args) {
        int[] arrayType = { 15, 40, 500, 324 };
        try {
            int fifth = arrayType[5];
        } catch(ArrayIndexOutOfBoundsException exc) {
            System.out.println("It is out of the bounds");
        }
    }
}
