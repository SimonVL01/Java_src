import java.util.Scanner;

public class ifElseOefening {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Geef een nummer in.");
        int nummer = s.nextInt();

        if(nummer > 10) {
            System.out.println(nummer + " is een groot nummer.");
        } else if(nummer == 10) {
            System.out.println("Proficiat! Je wint een prijs!");
        } else {
            System.out.println(nummer + " is een klein nummer.");
        }
    }

}