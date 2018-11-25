package javaWeek_1.conditions;
import java.util.ArrayList;
import java.util.List;

public class w3e4 {

    public static void main(String[] args) {

        List<Integer> money = new ArrayList<>();
        money.add(5);
        money.add(10);
        money.add(7);

        Integer count = 0;

        for (int position = money.size() - 1; position >= 0; position--) {
            count = count + money.get(position);

        }
        System.out.println("I have a total of " + count + " Euro");
    }
}
/*
Part A

Collection of Number money = getMoneyNumbersFromHanselsFriends()

Part B

Number total = 0
repeat for each amount in money
  total = total + amount
say(“I have a total of ” + total + “ Euro”)

 */

