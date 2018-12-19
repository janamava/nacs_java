package javaWeek_7.exercise4;

import javaWeek_7.exercise4.NumberSplitter;
import org.junit.jupiter.api.Test;

import java.util.List;

class NumberSplitterTest {

    private NumberSplitter splitter = new NumberSplitter();

    @Test
    void split() {
        Integer number = -4653;
        List<String> splitted = splitter.split(number);
        System.out.println(splitted);

    }

}