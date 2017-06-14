import java.util.Scanner;

public class Oefening3XGetal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int getal;
        int i;
        int j = 0;
        int x = 0;
        int y = 0;
        System.out.println("Geef getal op.");
        for(i = 0; i < 3; i++) {
            getal = s.nextInt();
            if (i == 0) {
                j = getal;
            }
            if (i == 1) {
                x = getal;
            }
            if (i == 2) {
                y = getal;
            }

        }
        System.out.println(j + " " + x + " " + y);
    }
}