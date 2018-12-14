package javaWeek_6.exercise6;

public class DecisionMaker {

    public void decide(Move move1, Move move2){

        if(move1.defeats(move2)){
            System.out.println("You win!");
        }
        else if(move1.getName().equals(move2.getName())){
            System.out.println("It's a tie.");
        }
        else {
            System.out.println("You lose!");
        }

    }
}
