import java.util.Scanner;

public class Oefening5_2_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Geef je score in.");
        int grade = s.nextInt();

        if(grade > 50) {
            System.out.println("Congratulations, you passed!");
        } else if(grade == 50) {
            System.out.println("Op het randje!");
        } else {
            System.out.println("You failed!");
        }
    }
}