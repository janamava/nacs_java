package javaWeek_5.exercise7_secondVersion;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Computer implements Player{

    @Override
    public Optional<Move> makeMove() {
        List<Move> moves = Moves.getMoves();
        Collections.shuffle(moves);
        Integer position = new Random().nextInt(3);
        Move move = moves.get(position);
        System.out.println("Player 2 chose: " + move);
        return Optional.of(move);
    }
}
