public class Oefening5_3_4 {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 1;
        int number3 = 1;
        int backup = 0;

        for(int i = 0; i < 20; i++) {
            System.out.print(" " + number1 + " " + number2);
            number3 += number2;
            number1 += number2;
            number2 = number3;

        }
    }
}