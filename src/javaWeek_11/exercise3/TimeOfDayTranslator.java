package javaWeek_11.exercise3;

import java.time.LocalTime;

public class TimeOfDayTranslator {

    public String translateTimeOfDay(LocalTime time) {
        System.out.println("i am here");
        if (time.isAfter(LocalTime.parse("05:59")) && (time.isBefore(LocalTime.parse("12:00")))) {
            return "in the morning";
        }
        if (time.toString().equals("12:00")) {
            return "noon";
        }
        if (time.isAfter(LocalTime.parse("12:00")) && (time.isBefore(LocalTime.parse("17:00")))) {
            return "in the afternoon";
        }
        if (time.isAfter(LocalTime.parse("16:59")) && (time.isBefore(LocalTime.parse("20:00")))) {
            return "in the evening";
        }
        if (time.toString().equals("00:00")) {
            return "midnight";
        }
        if (time.getHour() == 0){
            return "midnight";
        }
        if (time.isAfter(LocalTime.parse("19:59")) && (time.isBefore(LocalTime.MAX)
                && (time.isAfter(LocalTime.of(0, 0)) && (time.isBefore(LocalTime.parse("06:00")))))) {
            return "at night";
        }
//        if (time.getHour() == 0){
//            return "midnight";
//        }
        return "";
    }
}
