package javaWeek_11.exercise3;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Formatter {

    private List<Converter> converters = Converters.getList();

    public List<String> translate(LocalTime time) {
        return converters.stream()
                .map(e -> e.convert(time))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
    }
}
