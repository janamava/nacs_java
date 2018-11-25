package javaWeek_2.exercise7;

import java.util.ArrayList;
import java.util.List;

public class IntegerListProvider {

    List<Integer> provide550Integers() {

        List<Integer> list550Integers = new ArrayList<>();
        Integer number = 1;

        for (int times = 0; times < 550; times++) {
            list550Integers.add(number);
            number = number + 1;
        }
        return list550Integers;
    }
}
