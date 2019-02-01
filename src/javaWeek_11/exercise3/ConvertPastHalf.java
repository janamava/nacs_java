package javaWeek_11.exercise3;

import java.time.LocalTime;
import java.util.Optional;

public class ConvertPastHalf extends Converter {

    private Translator translator = new Translator();
    private TimeOfDayTranslator translatorTimeDay = new TimeOfDayTranslator();

    @Override
    public Optional<String> convert(LocalTime time) {


        if (time.getMinute() > 30) {
            return Optional.of(translator.convert(60 - time.getMinute()) + " minutes to " +
                    translator.convert(time.getHour() + 1) +
                    " " + translatorTimeDay.translateTimeOfDay(time));
        }
        return Optional.empty();
    }
}

