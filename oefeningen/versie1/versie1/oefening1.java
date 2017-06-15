package oefeningen.versie1.versie1;

public class oefening1 {
    public static void main(String[] args) {

        int getal = 5;

        System.out.println("Hallo dit is mijn eerste programma!");

        int getal2 = getal + 10;
        System.out.println(getal2);

        double[] cramer = CramersRegelFunctie.cramersRegel(5d, 6d, 7d, 8d, 9d, 10d);
        System.out.println(cramer[0] + " " + cramer[1]);
    }
}