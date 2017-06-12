import java.util.*;

public class Oefening2_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Geef 3 nummers in.");
        int first = s.nextInt();
        int second = s.nextInt();
        int third = s.nextInt();

        int average = (first + second + third) / 3;
        System.out.println(average);
    }
}