package javaWeek_8.exercise5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class PowerLevelScouter {

    public Integer scout (String name) {
      return transform(name, letter -> (int) letter.charAt(0) );
    }

    public Integer scoutEnhanced(String name) {
        return transform(name, letter -> (int) letter.toLowerCase().charAt(0) );
    }

    private Integer transform(String name, Function<String, Integer> transformation){
        int sum = 0;
        List<String> letters = new ArrayList<>(Arrays.asList(name.split("")));
        for (String letter : letters) {
            sum += transformation.apply(letter);
        }
        return sum;

    }
 }
