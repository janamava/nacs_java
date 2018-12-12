package javaWeek_6.exercise4;

import java.util.List;
import java.util.Optional;

public class GreedyAlgorithmApplication {

    public static void main(String[] args) {

        Optional<List<Money>> coins = new GreedyAlgorithm().calculateAsCoins(0);
        System.out.println(coins);
    }
}
