package oefeningen.versie1.versie14;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.text.DateFormat;


public class Oefening14_2 {
    private Instant startTime;
    private Instant endTime;
    private long runTime;

    public Instant getstartTime() {
        return startTime;
    }

    public Instant getEndTime() {
        return endTime;
    }

    public Oefening14_2() {
        startTime = Instant.now();
    }

    public void start() {
        startTime = Instant.now();

    }

    public void stop() {
        endTime = Instant.now();
    }

    public long getElapsedTime() {
        runTime = ChronoUnit.MILLIS.between(startTime, endTime);

        /*DateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        formatter.format(runtime);*/

        return runTime;
    }

}
