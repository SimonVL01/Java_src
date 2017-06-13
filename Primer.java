
public class Primer {
    public static void main(String[] args) {

        int getal = 0;
        for (int i = 0; i <= 100; i++) {
            if (Primer.isPrimeNumber(i)) {

                System.out.println(i);
            }
        }
    }

    public static boolean isPrimeNumber(final int number) {
        if (number < 2) {
            return false;
        } else {
            int deler = 2;
            while (deler < number - 1) {
                int rest = number % deler;
                if (rest == 0) {
                    return false;
                }
                deler++;
            }
        }


        return true;
    }
}
