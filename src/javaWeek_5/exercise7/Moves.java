package javaWeek_5.exercise7;

import java.util.Arrays;
import java.util.List;

public class Moves {

    private List<Move> moves = Arrays.asList(new Rock(), new Scissors(), new Paper());

    public List<Move> getMovesList(){
      return moves;
    }
}
