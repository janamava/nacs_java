package javaWeek_6.exercise6;

import java.util.Arrays;
import java.util.List;

public class Rock extends Move {

    @Override
    public List<String> getDefeats() {
        return Arrays.asList("scissors", "lizard");
    }

    @Override
    public String getName() {
        return "rock";
    }
}
