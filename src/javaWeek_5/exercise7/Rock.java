package javaWeek_5.exercise7;

public class Rock implements Move {

    private String name = "rock";

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void defeat(Move move2) {
        if (move2.toString().equals("scissors")){
            System.out.println("You win!");
        }
        else if (move2.toString().equals("paper")){
            System.out.println("You lose!");
        }
        else {
            System.out.println("It is a tie.");
        }
    }
}
