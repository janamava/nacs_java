package javaWeek1.labels;

import java.util.Arrays;
import java.util.List;

public class w2e15 {

    public static void main(String[] args) {

        List<String> clothes = Arrays.asList("blouse", "sneakers", "tie", "sandals", "jeans", "short pants", "tank", "blazer");
        String tank = clothes.get(6);
        String shortPants = clothes.get(5);
        String sneakers = clothes.get(1);
        System.out.println("Hansel will wear a " + tank + ", " + shortPants + " and " + sneakers);

    }

}
 /*
 Part A

Collection of String clothes = [“blouse”, “sneakers”, “tie”, “sandals”, “jeans”, “short pants”, “tank”, “blazer”]

Part B

String tank = clothes.get(6)
String shortPants = clothes.get(5)
String sneakers = clothes.get(1)

Part C

say(“Hansel will wear a ” + tank + “, ” + shortPants + “ and ” + sneakers)
  */