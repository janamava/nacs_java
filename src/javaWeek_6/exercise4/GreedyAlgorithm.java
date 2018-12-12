package javaWeek_6.exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GreedyAlgorithm {

    public Optional <List<Money>> calculateAsCoins(Integer change) {

        List<Money> coins = Coins.getCoins();
        List<Money> changeAsCoins = new ArrayList<>();
        Integer times;
        if(change==0){
            return Optional.empty();
        }

        for (Money coin : coins) {
            if (coin.isApplicable(change)) {
                times = change/coin.getAmount();

                for (int time = 0; time < times; time++) {
                    changeAsCoins.add(coin);
                }
                change = change - coin.getAmount()*times;
            }
        }
        return Optional.of(changeAsCoins);
    }
}
