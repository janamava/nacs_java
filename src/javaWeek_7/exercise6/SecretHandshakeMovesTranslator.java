package javaWeek_7.exercise6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecretHandshakeMovesTranslator {

    public List<Handshake> translate (Integer number){
        List<Handshake> performedHandshakes = new ArrayList<>();
        List<Handshake> handshakes = Handshakes.asList();
        List<String> strings = Arrays.asList(number.toString().split(""));

        for (String digitValue : strings) {
            for (Handshake handshake : handshakes) {
                if (handshake.getNumber().toString().equals(digitValue))
                    performedHandshakes.add(handshake);
            }
        }

        return performedHandshakes;
    }
}
/*

There are four kinds of handshake moves: thumb touches back, tickles over palm, bro knock and thousand knuckles.
The different moves of the handshake will be performed exactly in the order that the numbers appear within the price number.
The thumb touches back is performed on the number 2.
The tickles over palm is performed on the number 5.
The bro knock is performed on the number 6.
The thousand knuckles is performed on the number 9.

Create the class SecretHandshakeMovesTranslator that has a method that receives a number and
returns the collection containing the different handshakes in the right order that the secret agent
has to perform to receive the secret mission.
 */