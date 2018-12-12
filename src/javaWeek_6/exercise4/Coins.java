package javaWeek_6.exercise4;

import java.util.Arrays;
import java.util.List;

public class Coins {

    private static List<Money> coins = Arrays.asList(new Cent50(50), new Cent20(20),
            new Cent10(10), new Cent5(5), new Cent2(2), new Cent1(1));

    public static List <Money> getCoins(){
        return coins;
    }
}
