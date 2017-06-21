package oefeningen.versie1.versie11;

public class Oefening11_3 {
    public Oefening11_3() {
        int j = 1;
        int result;
    }

        public void someMethod(int j) {
            someMethod2(j);
    }


        public void someMethod2(int j) {

            try {
                int result = j / 0;
                throw new ArithmeticException("Divide doesn't work!");
            } catch (ArithmeticException exc) {
                System.out.println("You can' divide by zero!");
                exc.printStackTrace();

            }
    }

    public static void main(String[] args) {
        Oefening11_3 rethrow = new Oefening11_3();
        try {
            int j = 1 / 0;
        } catch (ArithmeticException exc) {
            rethrow.someMethod(6);
        }
    }

}
