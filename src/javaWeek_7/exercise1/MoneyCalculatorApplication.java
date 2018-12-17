package javaWeek_7.exercise1;

import java.util.List;

public class MoneyCalculatorApplication {

    public static void main(String[] args) {

        MoneyCalculator calculator = new MoneyCalculator();
        List<Integer> moneys = MoneyCollector.asList();

        System.out.println(moneys);

        Integer total = calculator.calculateTotalSum(moneys);
        System.out.println(total);

    }
}
