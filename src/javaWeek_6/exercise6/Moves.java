package javaWeek_6.exercise6;

import java.util.Arrays;
import java.util.List;

public class Moves {

    public static List<Move> asList(){
        return Arrays.asList(new Rock(), new Paper(), new Scissors(), new Lizard(), new Spock());
    }
}
