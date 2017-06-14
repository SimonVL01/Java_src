public class Oefening5_3_1 {
    public static void main(String[] args) {

        double i = 1;
        double j = 2;
        double jValue = i / j;
        double iValue = i + jValue;

        while (j < 50000) {
            j++;
            jValue = i / j;
            iValue = i + jValue;
            System.out.println(iValue);
        }

    }
}