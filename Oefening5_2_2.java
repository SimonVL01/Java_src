import java.util.Scanner;

public class Oefening5_2_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Geef een nummer van 0 tot 9.");
        int number = s.nextInt();

        while (number > 9) {
            System.out.println("Nummer te hoog.\nGeef een nummer op van 0 tot 9");
            number = s.nextInt();
        }

            switch (number) {
                case 0:
                    System.out.println("ZERO");
                    break;
                case 1:
                    System.out.println("ONE");
                    break;
                case 2:
                    System.out.println("TWO");
                    break;
                case 3:
                    System.out.println("THREE");
                    break;
                case 4:
                    System.out.println("FOUR");
                    break;
                case 5:
                    System.out.println("FIVE");
                    break;
                case 6:
                    System.out.println("SIX");
                    break;
                case 7:
                    System.out.println("SEVEN");
                    break;
                case 8:
                    System.out.println("EIGHT");
                    break;
                case 9:
                    System.out.println("NINE");
                    break;
            }
        }
}
