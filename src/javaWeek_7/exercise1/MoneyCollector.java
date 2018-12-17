package javaWeek_7.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MoneyCollector {

    public static List<Integer> asList() {
        List<Integer> wallet = new ArrayList<>();
        for (int times = 0; times < 10; times++) {
            int money = new Random().nextInt(5) + 1;
            wallet.add(money);
        }
        return wallet;
    }

}

