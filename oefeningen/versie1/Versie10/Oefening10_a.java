package oefeningen.versie1.Versie10;

/**
 * Created by simon on 21/06/17.
 */

public class Oefening10_a extends ArithmeticException {



    public void process(int x, int y) throws ArithmeticException {
        if ((x <= 0) || (y <= 0)) {
                throw new ArithmeticException("Give a number higher than zero.");
        } else {
            int result = x * y;
            System.out.println(result);
        }
    }

    public Oefening10_a(int x, int y) throws ArithmeticException {
            process(x, y);
    }

    public static void main(String[] args) {

        try {
            throw new Oefening10_a(-5, 70);
        } catch (ArithmeticException exc) {
            System.out.println(exc);
        }

    }
}
