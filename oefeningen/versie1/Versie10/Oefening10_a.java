package oefeningen.versie1.Versie10;

/**
 * Created by simon on 21/06/17.
 */

public class Oefening10_a {



    public void process(int x, int y) {
        if ((x <= 0) || (y <= 0)) {
            try {
                throw new ArithmeticException("Invalid number");
            }  catch(ArithmeticException exc) {
                System.out.println("Give a number higher than zero.");
                throw exc;
            }
        } else {
            int result = x * y;
            System.out.println(result);
        }
    }

    public void throwProcess() throws ArithmeticException {
            this.process(-5, 70);
    }

    public static void main(String[] args) {
        int x = 0;
        int y = 5;

        Oefening10_a newSum = new Oefening10_a();

        try {

            newSum.throwProcess();
        } catch (ArithmeticException exc) {
            System.out.println("Try again.");
        }

    }
}
