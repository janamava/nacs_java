package javaWeek_7.exercise4;

import java.util.Arrays;
import java.util.List;

public class NumberSplitter {

    public List<String> split(Integer number){
        Integer integer = Math.abs(number);
        String[] splitted = integer.toString().split("");
        return (Arrays.asList(splitted));
    }
}
