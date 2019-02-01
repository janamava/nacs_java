package javaWeek_11.exercise3;

import java.util.Map;

public class Translator {

    private MapMaker mapMaker = new MapMaker();
    private Map<Integer, String> until19 = mapMaker.makeUntil19();
    private Map<Integer, String> tens = mapMaker.makeTens();


    public String convert(Integer number) {
        if (number <= 19) {
            return until19.get(number);
        }
        if (number.equals(20) || (number.equals(30) || (number.equals(40) || (number.equals(50))))) {
            return tens.get(number);
        }
        if ((number > 20) &&(number < 30)) {
            Integer secondNumber = number % 10;
            Integer firstNumber = number - secondNumber;
            return tens.get(firstNumber) + " " + until19.get(secondNumber);
        }
        return "";

    }
}

