package javaWeek_11.test_pack;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedHumanTime {

    public static void main(String[] args) {

        System.out.println("--- ZONED HUMAN TIME");

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Now: " + now);


        ZoneId here = ZoneId.systemDefault();
        System.out.println("Here: " + here);


        ZonedDateTime nowHere = now.atZone(here);
        System.out.println("Now here: " + nowHere);


        System.out.println("Available zones: " + ZoneId.getAvailableZoneIds());
        ZoneId newYork = ZoneId.of("America/New_York");


        ZonedDateTime nowInNewYork = nowHere.withZoneSameInstant(newYork);
        System.out.println("Now in New York: " + nowInNewYork);

    }
}
