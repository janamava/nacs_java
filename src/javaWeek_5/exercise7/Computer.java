package javaWeek_5.exercise7;

import java.util.List;
import java.util.Random;

public class Computer implements Player {

    @Override
    public Move makeMove() {
        List<Move> movesList = new Moves().getMovesList();
        Integer position = new Random().nextInt(3);
        Move move = movesList.get(position);
        System.out.println("Player2 chose: " + move);
        return move;
    }
}
