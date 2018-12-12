package javaWeek_6.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Optional;


class GreedyAlgorithmTest {

    GreedyAlgorithm algorithm = new GreedyAlgorithm();

    @Test
    void calculate0Change() {
        Optional<List<Money>> calculated = algorithm.calculateAsCoins(0);
        Assertions.assertEquals(Optional.empty(), calculated);

    }

    @Test
    void calculate88Change() {
        int expected = 6;
        Optional<List<Money>> calculated = algorithm.calculateAsCoins(88);
        Assertions.assertEquals(expected, calculated.get().size());
    }

    @Test
    void calculate149Change() {
        int expected = 7;
        Optional<List<Money>> calculated = algorithm.calculateAsCoins(149);
        Assertions.assertEquals(expected, calculated.get().size());
    }
}

//}
/*
Create the GreedyAlgorithmTest class that checks at least the following cases:
The amount given is zero, then the change list should be empty.
The amount given is 88, then the change list should contain 6 coins.
The amount given is 149, thensize the change list should contain 7 coins.

 */