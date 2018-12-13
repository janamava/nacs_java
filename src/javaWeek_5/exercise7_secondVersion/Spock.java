package javaWeek_5.exercise7_secondVersion;

public class Spock implements Move {

    @Override
    public void defeat(Move move) {
        if (move.toString().equals("scissors") || move.toString().equals("rock")){
            System.out.println("You win!");
        }
        else if (move.toString().equals("paper") || move.toString().equals("lizard")){
            System.out.println("You lose!");
        }
        else{
            System.out.println("It is a tie.");
        }
    }
    @Override
    public String toString() {
        return "spock";
    }
}
