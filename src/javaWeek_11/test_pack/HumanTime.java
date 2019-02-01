package javaWeek_11.test_pack;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class HumanTime {

    public static void main(String[] args) {

        System.out.println("---LOCAL DATE");

        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        LocalDate fiveWeeksAgo = today.minusWeeks(5);
        System.out.println("Five weeks ago: " + fiveWeeksAgo);

        LocalDate someDayThisYear = LocalDate.parse("2019-06-06");
        System.out.println("This year is a leap year: " + someDayThisYear.isLeapYear());
        System.out.println("Last year was a leap year: " + someDayThisYear.minusYears(1).isLeapYear());
        System.out.println("Next year will be a leap year: " + someDayThisYear.plusYears(1).isLeapYear());

        System.out.println("---LOCAL TIME");

        LocalTime time = LocalTime.now();
        System.out.println("Time: " + time);

        LocalTime someTime = LocalTime.parse("13:37:33");
        System.out.println("Some time: " + someTime);
        System.out.println("Hours: " + someTime.getHour());
        System.out.println("Minutes: " + someTime.getMinute());
        System.out.println("Seconds: " + someTime.getSecond());

        System.out.println("---LOCAL DATE TIME");

        System.out.println("Right now: " + LocalDateTime.now());
        LocalDateTime someMoment = LocalDateTime.of(someDayThisYear, someTime);
        System.out.println("Some moment: " + someMoment);

        System.out.println("---PERIOD");
        Period period = Period.between(today, someDayThisYear);
        System.out.println("Period: " + period);
        System.out.println("Period in years: " + period.getYears());
        System.out.println("Period in months: " + period.getMonths());
        System.out.println("Period in days: " + period.getDays());

    }
}
