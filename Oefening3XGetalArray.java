import java.util.Arrays;
import java.util.Scanner;

public class Oefening3XGetalArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Geef 3 getallen in.");
        int[] lijst = new int[3];
        int inGeefGetal;

        for(int i = 0; i < lijst.length; i++) {
            inGeefGetal = s.nextInt();
           lijst[i] = inGeefGetal;
            System.out.println(lijst[i]);
        }
        System.out.println(Arrays.toString(lijst));
    }
}