package javaWeek_5.exercise7;

import java.util.Scanner;

public class Game {

    public void play(){
        Player player1 = new Human();
        Player player2 = new Computer();
        DecisionMaker referee = new DecisionMaker();

        Move move1 = player1.makeMove();
        Move move2 = player2.makeMove();

        referee.compare(move1, move2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to play again?");
        if (scanner.nextLine().equals("yes")){
            play();//recursion
        }
    }
}

