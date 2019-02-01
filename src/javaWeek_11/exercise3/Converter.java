package javaWeek_11.exercise3;

import java.time.LocalTime;
import java.util.Optional;

public abstract class Converter {

    public abstract Optional<String> convert(LocalTime time);
}

