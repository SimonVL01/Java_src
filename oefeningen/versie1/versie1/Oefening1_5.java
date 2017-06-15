package oefeningen.versie1.versie1;//average speed


public class Oefening1_5 {
    public static void main(String[] args) {
        int runningSpeed = 14;
        int tijd = 45 * 60 + 30;

        double tijdInUren = tijd / 3600d;
        double kilometerPerUur = runningSpeed / tijdInUren;

        double mijlPerUur = kilometerPerUur / 1.6;
        double eindResultaat = Math.round(mijlPerUur * 100) / 100d;
        System.out.println("The runner runs " + eindResultaat + " miles per hour!");

    }
}