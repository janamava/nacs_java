package javaWeek_6.exercise6;

import java.util.Arrays;
import java.util.List;

public class Lizard extends Move {

    @Override
    public List<String> getDefeats() {
        return Arrays.asList("spock", "paper");
    }

    @Override
    public String getName() {
        return "lizard";
    }
}
