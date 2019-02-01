package javaWeek_11.exercise3;

import java.time.LocalTime;
import java.util.Optional;

public class ConvertBeforeHalf extends Converter {

    private Translator translator = new Translator();
    private TimeOfDayTranslator translatorTimeDay = new TimeOfDayTranslator();

    @Override
    public Optional<String> convert(LocalTime time) {

        if((time.getHour() == 0)){
            if(time.getMinute() == 0){
                return Optional.of("midnight");
            }
            return Optional.of(translator.convert(time.getMinute())
                    + " minutes past " + translatorTimeDay.translateTimeOfDay(time));
        }
        if ((time.getMinute() > 0) && (time.getMinute() <= 30)) {
            return Optional.of(translator.convert(time.getMinute()) + " minutes past " +
                    translator.convert(time.getHour()) + " " + translatorTimeDay.translateTimeOfDay(time));
        }
        return Optional.empty();
    }
}
