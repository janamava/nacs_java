package javaWeek_5.exercise7_secondVersion;

import java.util.Arrays;
import java.util.List;

public class Moves {

    //it is created once and can be reused without wasting memory
    private static List<Move> moves = Arrays.asList(new Rock(), new Scissors(), new Paper(),
            new Lizard(), new Spock());

    public static List<Move> getMoves() {
        return moves;
    }
}
