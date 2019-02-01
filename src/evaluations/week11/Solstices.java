package evaluations.week11;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

public class Solstices {

    public String countdownSummerSolstice(LocalDate today) {
        if (today.isLeapYear()) {
            LocalDate dateSummerSolsticeLeapYear = LocalDate.parse(today.getYear() + "-06-20");
            Period daysInLeapYear = Period.between(today, dateSummerSolsticeLeapYear);
            return "The Summer Solstice " + today.getYear() + " is on " +
                    dateSummerSolsticeLeapYear.getDayOfWeek() + " , " + dateSummerSolsticeLeapYear.getMonth() +
                    dateSummerSolsticeLeapYear.getDayOfMonth() + " , " + dateSummerSolsticeLeapYear.getYear() + " (in "
                    + daysInLeapYear.getDays() + " days).";
        }
        LocalDate dateSummerSolstice = LocalDate.parse(today.getYear() + "-06-21");
        Period daysInYear = Period.between(today, dateSummerSolstice);
        return "The Summer Solstice " + today.getYear() + " is on " +
                dateSummerSolstice.getDayOfWeek() + ", " + dateSummerSolstice.getMonth() + " " +
                dateSummerSolstice.getDayOfMonth() + ", " + dateSummerSolstice.getYear() + " (in "
                + daysInYear.getDays() + " days).";
    }

    public String countdownWinterSolstice(LocalDate today){

        return " days left to Winter Solstice!";
    }
}
