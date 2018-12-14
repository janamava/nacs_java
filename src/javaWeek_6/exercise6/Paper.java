package javaWeek_6.exercise6;

import java.util.Arrays;
import java.util.List;

public class Paper extends Move {

    @Override
    public List<String> getDefeats() {
        return Arrays.asList("rock", "spock");
    }

    @Override
    public String getName() {
        return "paper";
    }
}
