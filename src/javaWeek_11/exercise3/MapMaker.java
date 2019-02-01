package javaWeek_11.exercise3;

import java.util.HashMap;
import java.util.Map;

public class MapMaker {

    public Map<Integer, String> makeUntil19() {

        Map<Integer, String> upTo19 = new HashMap<>();
        upTo19.put(0, "zero");
        upTo19.put(1, "one");
        upTo19.put(2, "two");
        upTo19.put(3, "three");
        upTo19.put(4, "four");
        upTo19.put(5, "five");
        upTo19.put(6, "six");
        upTo19.put(7, "seven");
        upTo19.put(8, "eight");
        upTo19.put(9, "nine");
        upTo19.put(10, "ten");
        upTo19.put(11, "eleven");
        upTo19.put(12, "twelve");
        upTo19.put(13, "thirteen");
        upTo19.put(14, "fourteen");
        upTo19.put(15, "fifteen");
        upTo19.put(16, "sixteen");
        upTo19.put(17, "seventeen");
        upTo19.put(18, "eighteen");
        upTo19.put(19, "nineteen");

        return upTo19;

    }

    public Map<Integer, String> makeTens() {

        Map<Integer, String> tens = new HashMap<>();
        tens.put(20, "twenty");
        tens.put(30, "thirty");
        tens.put(40, "forty");
        tens.put(50, "fifty");


        return tens;
    }
}
