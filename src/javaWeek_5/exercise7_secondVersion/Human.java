package javaWeek_5.exercise7_secondVersion;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Human implements Player{

    @Override
    public Optional<Move> makeMove() {
        System.out.println("These are your options: rock, paper, scissors");
        System.out.println("Choose one:");

        String input = new Scanner(System.in).nextLine();
        List<Move> moves = Moves.getMoves();

        for (Move move : moves) {
            if(input.equals(move.toString())){
                System.out.println("Player 1 chose: " + move);
                return Optional.of(move);
            }
        }
        System.out.println("This was not an option.");
        makeMove();
        return Optional.empty();
    }
}
