package javaWeek_6.exercise6;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Computer extends Player {

    @Override
    public Move makeMove() {
        List<Move> moves = Moves.asList();
        Collections.shuffle(moves);
        Integer position = new Random().nextInt(5);
        Move move = moves.get(position);
        System.out.println("Player 2 chose: " + move);
        return move;
    }
}
