//average speed

public class Oefening1_5 {
    public static void main(String[] args) {
        int runningSpeed = 14;
        double runningSpeedMile = runningSpeed * 0.621371d;
        float runningTime = 45.30f;
        float runningHour = 45.30f * 100 / 60;
        double runningHourFull = runningSpeedMile * runningTime / 100;
        double runningSpeedHour = runningSpeedMile + runningHourFull;
        System.out.println("The runner runs " + runningSpeedHour + " miles per hour!");
    }

}