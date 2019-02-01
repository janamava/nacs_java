package javaWeek_11.exercise3;

import java.time.LocalTime;
import java.util.List;

public class FormatterApp {

    public static void main(String[] args) {

        Formatter formatter = new Formatter();
        List<String> translate = formatter.translate(LocalTime.parse("00:45"));
        List<String> translate0 = formatter.translate(LocalTime.parse("00:00"));
        List<String> translate1 = formatter.translate(LocalTime.parse("12:00"));
        List<String> translate2 = formatter.translate(LocalTime.parse("14:59"));
        System.out.println(translate.get(0));
        System.out.println(translate0.get(0));
        System.out.println(translate1.get(0));
        System.out.println(translate2.get(0));



    }

}
