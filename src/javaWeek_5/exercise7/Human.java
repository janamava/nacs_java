package javaWeek_5.exercise7;

import java.util.List;
import java.util.Scanner;

public class Human implements Player {

    @Override
    public Move makeMove() {

        List<Move> movesList = new Moves().getMovesList();

        while (true) { //infinite loop
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose one: ");
            String input = scanner.nextLine();


            for (Move move : movesList) {
                if (input.equals(move.toString())) {
                    System.out.println("Player1 chose: " + move.toString());
                    return move;//loop break
                }
            }
        }
    }
}
