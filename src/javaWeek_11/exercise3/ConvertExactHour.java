package javaWeek_11.exercise3;

import java.time.LocalTime;
import java.util.Optional;

public class ConvertExactHour extends Converter {

    private Translator translator = new Translator();
    private TimeOfDayTranslator translatorTimeDay = new TimeOfDayTranslator();

    @Override
    public Optional<String> convert(LocalTime time) {
        if (time.toString().equals("12:00")) {
            return Optional.of("noon");
        }
        if (time.toString().equals("00:00")) {
            return Optional.of("midnight");
        }
        if (time.getMinute() == 0) {
            return Optional.of(translator.convert(time.getHour()) + " o'clock " +
                    translatorTimeDay.translateTimeOfDay(time));
        }
        return Optional.empty();
    }
}
