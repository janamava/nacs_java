package javaWeek_5.exercise7_secondVersion;

import java.util.Optional;
import java.util.Scanner;

public class Game {

    public void play(){

        System.out.println("Let's play rock, paper, scissors, lizard, spock!");

        Player player1 = new Human();
        Player player2 = new Computer();

        Optional<Move> move1 = player1.makeMove();
        Optional<Move> move2 = player2.makeMove();

        DecisionMaker referee = new DecisionMaker();
        referee.decide(move1, move2);
        askPlayers();
    }

    public void askPlayers() {
        System.out.println("Do you want to play again?");
        String answer = new Scanner(System.in).nextLine();
        if ("yes".equals(answer)){
            play();
        }
        else{
            System.out.println("See you next time!");
        }
    }
}
