package javaWeek_11.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.*;

public class TimeTest {

    @Test
    void testQuestions() {


        //time when he woke up(2003-03-13T10:00)
        LocalDateTime wakeUpTime = LocalDateTime.parse("2003-03-13T10:00");
        DayOfWeek dayOfWeek = LocalDate.of(2003, 03, 13).getDayOfWeek();
        String actual = "It is " + wakeUpTime + "am on " + dayOfWeek;
        String expected = "It is 2003-03-13T10:00am on THURSDAY";
        Assertions.assertEquals(actual, expected);


        //time he was picked up from home(2003-03-13T10:37:21)
        LocalDateTime actualPickUpTime = wakeUpTime.plusMinutes(37).plusSeconds(21);
        LocalTime expectedPickUpTime = LocalTime.parse("10:37:21");
        Assertions.assertEquals(expectedPickUpTime, actualPickUpTime.toLocalTime());


        //time he arrived to the airport(2003-03-13T12:07:21)
        LocalDateTime actualAirportArrivalTime = actualPickUpTime.plusHours(1).plusMinutes(30);
        LocalTime expectedAirportArrivalTime = LocalTime.parse("12:07:21");
        Assertions.assertEquals(expectedAirportArrivalTime, actualAirportArrivalTime.toLocalTime());


        //if he missed his plane
        boolean actualAnswer = LocalTime.parse("11:04").isBefore(actualAirportArrivalTime.toLocalTime());
        Assertions.assertTrue(actualAnswer);


        //how long he waits for the next flight(PT6H37M39S)
        LocalDateTime flightTime = LocalDateTime.parse("2003-03-13T18:45");
        Duration actualDuration = Duration.between(actualAirportArrivalTime.toLocalTime(), flightTime.toLocalTime());
        Duration expectedDuration = Duration.parse("PT6H37M39S");
        Assertions.assertEquals(expectedDuration, actualDuration);


        //time in London after flight(2003-03-14T06:35)
        LocalDateTime actualTimeInLondonAfterFlight = flightTime.plusHours(11).plusMinutes(50);
        LocalDateTime expectedTimeInLondonAfterFlight = LocalDateTime.parse("2003-03-14T06:35");
        Assertions.assertEquals(expectedTimeInLondonAfterFlight, actualTimeInLondonAfterFlight);


        //time and date in Tokyo(2003-03-14T15:35)
        ZoneId ofLondon = ZoneId.of("Europe/London");
        ZoneId ofTokyo = ZoneId.of("Asia/Tokyo");

        ZonedDateTime zonedDateTimeOfLondon = actualTimeInLondonAfterFlight.atZone(ofLondon);
        LocalDateTime actualArrivalDateTimeOfTokyo = zonedDateTimeOfLondon.withZoneSameInstant(ofTokyo).toLocalDateTime();
        LocalDateTime expectedLocalDateTimeTokyo = LocalDateTime.parse("2003-03-14T15:35");
        Assertions.assertEquals(expectedLocalDateTimeTokyo, actualArrivalDateTimeOfTokyo);



        //time when his manager hits him with pillows as to wake him up("2003-03-15T02:35")
        LocalDateTime actualManagerWakeUp = actualArrivalDateTimeOfTokyo.plusHours(2).plusHours(9);
        LocalDateTime expectedManagerWakeUp = LocalDateTime.parse("2003-03-15T02:35");
        Assertions.assertEquals(expectedManagerWakeUp, actualManagerWakeUp);



        //time when ad shooting starts("2003-03-15T03:22")
        LocalDateTime actualAdShootingStart = actualManagerWakeUp.plusMinutes(47);
        LocalTime expectedAdShootingStart = LocalTime.parse("03:22");
        Assertions.assertEquals(expectedAdShootingStart, actualAdShootingStart.toLocalTime());



        //time he talked to Katinka
        Duration actualCallDuration = Duration.ofSeconds(546);
        Duration expectedCallDuration = Duration.parse("PT9M6S");
        Assertions.assertEquals(expectedCallDuration, actualCallDuration);



        //time for lunch or dinner? (2003-03-15T10:22) is there a smarter way?
        LocalDateTime actualTimeAdShootingIsOver = actualAdShootingStart.plusHours(7);
        boolean isLunchTimePassed = LocalDateTime.parse("2003-03-15T13:00").isBefore(actualTimeAdShootingIsOver);
        Assertions.assertFalse(isLunchTimePassed);



        //japanese time when he lands in London("2003-03-19T10:12")
        LocalDateTime timeHeFliesBackToLondon = actualTimeAdShootingIsOver.plusDays(3).plusHours(12);
        LocalDateTime actualJapaneseTimeHeLandsInLondon = timeHeFliesBackToLondon.plusHours(11).plusMinutes(50);
        LocalDateTime expectedJapaneseTimeHeLandsInLondon = LocalDateTime.parse("2003-03-19T10:12");
        Assertions.assertEquals(expectedJapaneseTimeHeLandsInLondon, actualJapaneseTimeHeLandsInLondon);



        //british date when he lands in London(2003-03-19T01:12)
        ZonedDateTime zonedDateTimeTokyo = actualJapaneseTimeHeLandsInLondon.atZone(ofTokyo);
        LocalDateTime actualBritishTimeHeLandsInLondon = zonedDateTimeTokyo.withZoneSameInstant(ofLondon).toLocalDateTime();
        LocalDate actualDateHeArrivesInLondon = actualBritishTimeHeLandsInLondon.toLocalDate();
        LocalDate expectedDateheArrivesInLondon = LocalDate.parse("2003-03-19");
        Assertions.assertEquals(expectedDateheArrivesInLondon, actualDateHeArrivesInLondon);



        //time he signed autographs for 173 fans 12 seconds each
        Duration durationInSeconds = Duration.parse("PT2076S");
        long durationInHours = durationInSeconds.toHours();
        long durationInMinutes = durationInSeconds.toMinutes();
        String actualHoursAndMinutesWithFans = durationInHours + " hours " + durationInMinutes + " minutes";
        String expectedHoursAndMinutesWithFans = "0 hours 34 minutes";
        Assertions.assertEquals(expectedHoursAndMinutesWithFans, actualHoursAndMinutesWithFans);



        //can he stay for half an hour in the sauna
        LocalDateTime actualTimeAfterHeSignedAutographs = actualBritishTimeHeLandsInLondon.plusSeconds(173 * 12);
        LocalDateTime actualTimeHeDecidestoGoToSauna = actualTimeAfterHeSignedAutographs.plusHours(1);
        System.out.println(actualTimeHeDecidestoGoToSauna);
        LocalDateTime maybeEndSaunaTime = actualTimeHeDecidestoGoToSauna.plusMinutes(30);
        Duration between = Duration.between(actualTimeHeDecidestoGoToSauna, maybeEndSaunaTime);



        //is Thursday, Sunday or leapYear Saturday

        //time to turn the tv on
        LocalDateTime oneWeekLaterLondon = actualTimeAfterHeSignedAutographs.plusWeeks(1);
        System.out.println(oneWeekLaterLondon);//(2003-03-26T01:46:36)


//        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//        for (String availableZoneId : availableZoneIds) {
//            System.out.println(availableZoneId);
//        }

    }

    public static class Converter {
    }
}
/*
Mugatu arrives at his hotel one hour later and decides to go to the sauna.
This one is only open from 9:00 to 14:00 and from 16:00 to 20:00.
Can he at least manage to stay in the sauna for half an hour?


The special one-hour massage offered by the hotel is on Thursdays and Sundays,
and if it is a leap year, also on Saturdays. Can Mugatu be lucky enough to get one of those?


One week later, the advertisement is broadcasted at 18:30 in Tokyo’s time.
When does Mugatu have to turn on the TV in London to be able to see it?


The advertisement lasts 29 seconds.
Fifteen seconds afterwards his manager calls him on the phone to congratulate him for his popularity increase.
At what time exactly does this happen? What day of the week is this?


How many days have passed by since he woke up at the beginning of the timetable?


Mugatu gets paid for the timetable rights 1.39 Euro per minute of his privacy
since the beginning of the timetable until the end, except for the time of the private call that
Mugatu had with Katinka. How much is he paid for this reportage?



After 7 hours the shooting is over. Lunch time is round 13:00 and dinner time is around 20:00.
Should Mugatu have lunch or dinner?
 */