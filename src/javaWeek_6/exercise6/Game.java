package javaWeek_6.exercise6;

import java.util.List;
import java.util.Scanner;

public class Game {

    public void run(){

        DecisionMaker referee = new DecisionMaker();

        List<Player> players = Players.getPlayers();
        Player player1 = players.get(0);
        Player player2 = players.get(1);
        Move move1 = player1.makeMove();
        Move move2 = player2.makeMove();
        referee.decide(move1, move2);
        askPlayAgain();
    }

    public void askPlayAgain(){
        System.out.println("Do you want to play again? (yes/no)");
        String answer = new Scanner(System.in).nextLine();
        if ("yes".equals(answer)){
            run();
        }
        else{
            System.out.println("See you next time!");
        }
    }
}
