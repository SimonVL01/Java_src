package java24hours;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        int[] getallen = new int[5];
        for(int i = 0; i < getallen.length; i++) {

            System.out.println("Geef getal " + (i + 1) + " van " + getallen.length + " op: ");
            getallen[i] = s.nextInt();
        }
        for (int i = 0; i < getallen.length; i++) System.out.print(getallen[i] + ", ");

        System.out.println("\n" + Arrays.toString(getallen));
    }
}