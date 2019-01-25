package javaWeek_10.exercise3.logic;

import org.junit.jupiter.api.Test;

import java.util.Optional;

class SmsAnalystTest {

    private SmsAnalyst smsAnalyst = new SmsAnalyst();


    @Test
    void getRatio() {

        String ratio = smsAnalyst.getRatio();
        System.out.println(ratio);
        Optional<String> mostAppeared = smsAnalyst.getMostAppeared();
        if (mostAppeared.isPresent()){
            System.out.println(mostAppeared.get());
        }

        Optional<String> theMostAppearingLetter = smsAnalyst.findTheMostAppearingLetter();
        if (theMostAppearingLetter.isPresent()){
            System.out.println(theMostAppearingLetter.get());
        }
        Optional<Integer> longestMessage = smsAnalyst.findLongestMessage();
        if (longestMessage.isPresent()){
            System.out.println(longestMessage.get());
        }
    }

    @Test
    void getTotal() {

        long total = smsAnalyst.getTotal();
        System.out.println(total);
    }
}