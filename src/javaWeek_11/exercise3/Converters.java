package javaWeek_11.exercise3;

import java.util.Arrays;
import java.util.List;

public class Converters {

    public static List<Converter> getList(){
        return Arrays.asList(new ConvertBeforeHalf(), new ConvertPastHalf(), new ConvertExactHour());
    }
}
