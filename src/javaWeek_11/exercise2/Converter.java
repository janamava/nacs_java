package javaWeek_11.exercise2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Converter {

    private DateTimeFormatter format12Hour = DateTimeFormatter.ofPattern("hh:mm:ss a");
    //private DateTimeFormatter format24Hour = DateTimeFormatter.ofPattern("HH:mm:ss");
    //we dont need this formatter because by default java uses 24 hour format

    public String toMilitaryTime(String time) {
        LocalTime parsed = LocalTime.parse(time, format12Hour);
        System.out.println(parsed);

        return parsed.toString();
    }
}
