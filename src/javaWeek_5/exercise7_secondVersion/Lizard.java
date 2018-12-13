package javaWeek_5.exercise7_secondVersion;

public class Lizard implements Move {

    @Override
    public void defeat(Move move) {
        if (move.toString().equals("spock") || move.toString().equals("paper")) {
            System.out.println("You win!");
        } else if (move.toString().equals("rock") || move.toString().equals("scissors")) {
            System.out.println("You lose!");
        } else {
            System.out.println("It is a tie.");
        }
    }
    @Override
    public String toString() {
        return "lizard";
    }
}
