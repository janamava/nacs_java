package javaWeek_6.exercise6;

import java.util.Arrays;
import java.util.List;

public class Scissors extends Move {

    @Override
    public List<String> getDefeats() {
        return Arrays.asList("paper", "lizard");
    }

    @Override
    public String getName() {
        return "scissors";
    }
}
