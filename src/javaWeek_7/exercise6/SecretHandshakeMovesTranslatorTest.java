package javaWeek_7.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SecretHandshakeMovesTranslatorTest {

    private SecretHandshakeMovesTranslator translator = new SecretHandshakeMovesTranslator();


    @Test
    void translate() {
        Integer price = 587;
        List<Handshake> translated = translator.translate(price);
        List<Handshake> expected = Arrays.asList(new TicklesOverPalm());
        Assertions.assertEquals(expected, translated);
    }
}