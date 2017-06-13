/**
 * Created by vdabcursist on 13/06/2017.
 */
public class runningSpeed {
    public static double runningSpeed(int runningSpeed, int tijd) {
        double tijdAangepast = tijd * 60 + 30;
        double tijdInUren = tijdAangepast / 3600d;
        double runningSpeedPerUur = runningSpeed / tijdInUren;
        double mijlPerUur = runningSpeedPerUur / 1.6;
        double eindResultaat = Math.round(mijlPerUur * 100) / 100d;
        return eindResultaat;


    }
}
