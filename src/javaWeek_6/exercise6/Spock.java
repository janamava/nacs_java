package javaWeek_6.exercise6;

import java.util.Arrays;
import java.util.List;

public class Spock extends Move {

    @Override
    public List<String> getDefeats() {
        return Arrays.asList("scissors", "rock");
    }

    @Override
    public String getName() {
        return "spock";
    }
}
