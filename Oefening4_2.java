//RegelVanCramer

import java.util.Date;
import java.util.Scanner;

public class Oefening4_2 {
    public static void main(String[]args){

        Scanner s = new Scanner(System.in);

        System.out.println("Geef nummer a, b, c, d, e en f in.");
        double a = s.nextDouble(),
                b = s.nextDouble(),
                c = s.nextDouble(),
                d = s.nextDouble(),
                e = s.nextDouble(),
                f = s.nextDouble();

        double x, y;

        x = (e*d - b*f) / (a*d - b*c);
        y = (a*f - e*c) / (a*d - b*c);

        System.out.println("x = " + x + "\ny = " + y);
    }
}