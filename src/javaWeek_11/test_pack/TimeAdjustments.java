package javaWeek_11.test_pack;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class TimeAdjustments {

    public static void main(String[] args) {

        System.out.println("---CHRONO UNIT");

        LocalDate today = LocalDate.now();
        LocalDate after = today.plus(123456789, ChronoUnit.DAYS);
        Period period = Period.between(today, after);
        System.out.println("Period in years: " + period.getDays());
        System.out.println("Period in months: " + period.getMonths());
        System.out.println("Period in days: " + period.getDays());

        long days = ChronoUnit.DAYS.between(today, after);
        System.out.println("Period in days: " + days);

        System.out.println("---TEMPORAL ADJUSTER");

        LocalDate firstDayOf2020 = LocalDate.of(2019, 06, 06).with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println("First day of next year: " + firstDayOf2020);
        System.out.println("First day of next year will be a: "+ firstDayOf2020.getDayOfWeek());
        System.out.println("First Sunday of next year will be the: "+ firstDayOf2020.with(TemporalAdjusters.next(DayOfWeek.SUNDAY)));

    }
}
