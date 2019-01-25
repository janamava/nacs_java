package javaWeek_10.exercise5.logic;

import org.junit.jupiter.api.Test;

class MovieAnalystTest {

    private MovieAnalyst analyst = new MovieAnalyst();

    @Test
    void getUnique() {

        analyst.print();

        Long unique = analyst.getUnique();
        System.out.println(unique);
    }

}
