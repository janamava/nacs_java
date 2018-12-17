package javaWeek_7.exercise1;

import java.util.List;

public class MoneyCalculator {

    public Integer calculateTotalSum(List<Integer> moneys) {
        Integer totalSum = 0;
        for (Integer money : moneys) {
            totalSum = totalSum + money;
        }
        return totalSum;
    }

}
