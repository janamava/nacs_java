package javaWeek_11.test_pack;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class ContinuousTime {

    public static void main(String[] args) {

        System.out.println("--- INSTANT");

        Instant now = Instant.now();
        System.out.println("Instant: " + now);

        Instant fiftySecondsLater = now.plusSeconds(50);
        System.out.println("Instant after 50 seconds: " + fiftySecondsLater);

        boolean isAfter = fiftySecondsLater.isAfter(now);
        System.out.println("Is after: " + isAfter);


        System.out.println("--- DURATION");

        Instant begin = Instant.now();
        Instant end = begin.plus(50, ChronoUnit.DAYS);
        Duration duration = Duration.between(begin, end);
        System.out.println("Duration: " + duration);
        System.out.println("Duration in days: " + duration.toDays());
        System.out.println("Duration in hours: " + duration.toHours());
        System.out.println("Duration in minutes: " + duration.toMinutes());


    }
}
