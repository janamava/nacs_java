package javaWeek_5.exercise7_secondVersion;

import java.util.Optional;

public class DecisionMaker {

    public void decide(Optional<Move> move1, Optional<Move> move2) {
        if (move1.isPresent() && move2.isPresent()) {
            move1.get().defeat(move2.get());
        }
    }
}
