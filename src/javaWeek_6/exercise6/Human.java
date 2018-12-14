package javaWeek_6.exercise6;

import java.util.List;
import java.util.Scanner;

public class Human extends Player {

    @Override
    public Move makeMove() {
        System.out.println("Let's play rock, paper, scissors, lizard, spock!");
        System.out.println("These are your options: rock, paper, scissors, lizard, spock");
        System.out.println("Choose one:");

        String input = new Scanner(System.in).nextLine();
        List<Move> moves = Moves.asList();

        for (Move move : moves) {
            if(input.equals(move.toString())){
                System.out.println("Player 1 chose: " + move);
                return move;
            }
        }
        System.out.println("This was not an option.");
        makeMove();
        return null;
    }
}
